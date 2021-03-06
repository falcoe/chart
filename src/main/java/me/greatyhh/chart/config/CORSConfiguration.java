package me.greatyhh.chart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: chart
 * @description:
 * @author: chuangheng.yang
 * @create: 2019-01-14 15:58
 **/
@Configuration
public class CORSConfiguration {

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedHeaders("*")
            .allowedMethods("*")
            .allowedOrigins("*").allowCredentials(true);
      }
    };
  }
}