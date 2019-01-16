package me.greatyhh.chart.controller;

import me.greatyhh.chart.model.vo.RecordAddVO;
import me.greatyhh.chart.utils.GreatyhhResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: chart
 * @description: 运动记录接口
 * @author: chuangheng.yang
 * @create: 2019-01-15 11:19
 **/

@RestController
@RequestMapping("/exercise")
public class ExerciseController {
  @GetMapping("/record")
  public GreatyhhResponse addRecord(RecordAddVO recordAddVO){
    return GreatyhhResponse.ok().remark("fuck");
  }
}
