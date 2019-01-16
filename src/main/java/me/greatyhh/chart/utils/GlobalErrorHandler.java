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
  public static final String DEFAULT_ERROR_VIEW = "error";

  @ExceptionHandler(value = Exception.class)
  @ResponseBody
  public String defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
    return "This is a message sent by an exception.";
  }

//  @ExceptionHandler(value = MyException.class)
//  @ResponseBody
//  public String myExceptionErrorHandler(HttpServletRequest req, Exception e) throws MyException {
//    return "This is a message sent by an exception.";
//  }
}
