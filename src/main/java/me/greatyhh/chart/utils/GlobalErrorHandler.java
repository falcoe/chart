package me.greatyhh.chart.utils;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: chart
 * @description: 统一处理异常
 * @author: chuangheng.yang
 * @create: 2019-01-15 14:01
 * @Version 1.0
 * @Since 1.0
 **/
@ControllerAdvice
class GlobalErrorHandler {

  @ExceptionHandler(value = Exception.class)
  @ResponseBody
  public GreatyhhResponse defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
    return GreatyhhResponse.fail().remark("Exception: " + e.getMessage()).code(500);
  }

  /**
   * 全局捕获AuthException并处理
   * @return
   */
  @ExceptionHandler(value = AuthException.class)
  @ResponseBody
  public GreatyhhResponse authExceptionHandler(AuthException e) {
    return GreatyhhResponse.fail().remark("AuthException: " + e.getMessage()).code(204);
  }

//  @ExceptionHandler(value = MyException.class)
//  @ResponseBody
//  public String myExceptionErrorHandler(HttpServletRequest req, Exception e) throws MyException {
//    return "This is a message sent by an exception.";
//  }
}
