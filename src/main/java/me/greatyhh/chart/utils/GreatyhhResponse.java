package me.greatyhh.chart.utils;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @program: chart
 * @description: 统一返回类
 * @author: chuangheng.yang
 * @create: 2019-01-15 11:22
 **/
@Data
@Accessors(chain = true)
public class GreatyhhResponse<T> implements Serializable{

  /**
   * 请求成功flag
   */
  private boolean ok;

  /**
   * 请求失败flag
   */
  private boolean fail;

  /**
   * 服务相应的状态码
   */
  private String code;

  /**
   * 返回的数据
   */
  private T data;

  /**
   * 备注
   */
  private String remark;

  /**
   * 数据条数
   */
  private long total;

  public GreatyhhResponse(){

  }

  public static GreatyhhResponse ok() {
    GreatyhhResponse response = new GreatyhhResponse();
    response.ok = true;
    return response;
  }

  public static GreatyhhResponse fail() {
    GreatyhhResponse response = new GreatyhhResponse();
    response.fail = true;
    return response;
  }

  public GreatyhhResponse code(String code) {
    this.code = code;
    return this;
  }

  public GreatyhhResponse data(T data) {
    this.data = data;
    return this;
  }

  public GreatyhhResponse remark(String remark) {
    this.remark = remark;
    return this;
  }

  public GreatyhhResponse total(long total) {
    this.total = total;
    return this;
  }

  @Override
  public String toString() {
    return "GreatyhhResponse{" +
        "ok=" + ok +
        ", code='" + code + '\'' +
        ", data=" + data +
        ", remark='" + remark + '\'' +
        ", total=" + total +
        '}';
  }

}
