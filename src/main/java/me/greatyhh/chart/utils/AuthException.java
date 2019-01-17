package me.greatyhh.chart.utils;

/**
 * @program: chart
 * @description: 身份验证异常
 * @author: chuangheng.yang
 * @create: 2019-01-17 14:43
 **/
public class AuthException extends RuntimeException{

  public AuthException() {
  }

  public AuthException(String message) {
    super(message);
  }
}
