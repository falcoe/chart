package me.greatyhh.chart.model.vo;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @program: chart
 * @description: 前端传来的运动记录
 * @author: chuangheng.yang
 * @create: 2019-01-15 14:46
 **/
@Data
@Accessors(chain = true)
public class RecordAddVO implements Serializable {

  private static final long serialVersionUID = 8460428865380366893L;

  /**
   * 人员编号
   */
  private String mebmerId;

  /**
   * 锻炼时间，按分钟计时
   */
  private int time;

  /**
   * 时间段 0-早上 1-下午 2-晚上
   */
  private int sacle;

  /**
   * 运动类型 0-跑步 1-瑜伽 2-单车 3-KEEP
   */
  private int type;

  /**
   * 卡路里
   */
  private int calories;
}
