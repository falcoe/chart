package me.greatyhh.chart.aspect;

import com.alibaba.fastjson.JSON;
import java.util.Arrays;
import java.util.Optional;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import me.greatyhh.chart.utils.AuthException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @program: chart
 * @description: 验证身份
 * @author: chuangheng.yang
 * @create: 2019-01-17 09:34
 **/
@Aspect
@Slf4j
@Configuration
public class AuthFilter {

//  @After("execution(* me.greatyhh.chart.controller.*.*(..))")
//  public void after(JoinPoint joinPoint){
//    log.info("| After controlled is called: " + JSON.toJSON(joinPoint.getArgs()));
//  }

  @Around("@annotation(me.greatyhh.chart.annotation.TrackTime)")
  public Object aroundHandler(ProceedingJoinPoint joinPoint) throws Throwable {
    long startTime = System.currentTimeMillis();
    ServletRequestAttributes attributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    HttpServletRequest request = attributes.getRequest();
    log.info("+------------------Method call starts-----------------------------------------------------------------------------------------------------");
    log.info("| [METHOD]     :-> {}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
    log.info("| [REQUEST]    :-> {}", JSON.toJSON(joinPoint.getArgs()));
    log.info("| [IP_ADDRESS] :-> {}", request.getRemoteAddr());

    Cookie[] cookies = request.getCookies();
    if (cookies == null) {
      log.error("No cookies found.");
      throw new AuthException("No cookies found.");
    }
    Optional<Cookie> token = Arrays.stream(cookies).filter(cookie -> cookie.getName().equals("token")).findFirst();

    if (token.get() == null) {
      log.error("No token found.");
      throw new AuthException("No token found.");
    }
    String tokenString = token.get().getValue();

    Object result = joinPoint.proceed();
    long endTime = System.currentTimeMillis();

    long timeTaken = endTime - startTime;
    log.info("| [RESPONSE]   :-> {}", JSON.toJSONString(result));
    log.info("| [TIME]       :-> {}ms", JSON.toJSONString(timeTaken));
    log.info("+------------------Method call ends-----------------------------------------------------------------------------------------------------");
    return result;
  }
}
