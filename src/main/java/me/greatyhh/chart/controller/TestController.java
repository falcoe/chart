package me.greatyhh.chart.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import me.greatyhh.chart.annotation.TrackTime;
import me.greatyhh.chart.model.vo.ChartItemVO;
import me.greatyhh.chart.utils.GreatyhhResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

//  @TrackTime
  @GetMapping("/test")
  public GreatyhhResponse testChart(HttpServletResponse response) {
    ChartItemVO[] chartItems = new ChartItemVO[10];
    for (int i = 0; i < 10; i++) {
      ChartItemVO temp = new ChartItemVO();
      temp.setYear(String.valueOf(2008 + i));
      temp.setPrice(String.valueOf(2000 * (i + 1)));
      chartItems[i] = temp;
    }
    Cookie cookie = new Cookie("token", "totototo");
    cookie.setPath("/");
    response.addCookie(cookie);

    return GreatyhhResponse.ok().data(chartItems);
  }
}