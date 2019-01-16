package me.greatyhh.chart.model.vo;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @program: chart
 * @description:
 * @author: chuangheng.yang
 * @create: 2019-01-14 10:15
 **/
@Data
@Accessors(chain = true)
public class ChartItemVO implements Serializable {

  private static final long serialVersionUID = 6648315925201768535L;

  private String year;

  private String price;

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }
}
