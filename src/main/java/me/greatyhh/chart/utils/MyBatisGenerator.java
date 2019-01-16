package me.greatyhh.chart.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import java.util.ResourceBundle;

/**
 * @program: chart
 * @description: 生成entity service mapper
 * @author: chuangheng.yang
 * @create: 2019-01-16 11:26
 **/
public class MyBatisGenerator {

  public static void main(String[] args) {

    // 从配置文件获取配置
    ResourceBundle source = ResourceBundle.getBundle("MyBatis-Generator");
    AutoGenerator generator = new AutoGenerator();


    // 全局配置
    GlobalConfig config = new GlobalConfig();
    config.setOutputDir(source.getString("outputDir"));
    config.setFileOverride(true);
    config.setOpen(false);
    config.setBaseResultMap(true);
    config.setBaseColumnList(true);
    config.setActiveRecord(true);
    config.setEnableCache(true);
    config.setAuthor(source.getString("author"));
    generator.setGlobalConfig(config);

    // 数据源配置
    DataSourceConfig dataSourceConfig = new DataSourceConfig();
    dataSourceConfig.setDbType(DbType.MYSQL);
    dataSourceConfig.setDriverName(source.getString("driverName"));
    dataSourceConfig.setUsername(source.getString("username"));
    dataSourceConfig.setPassword(source.getString("password"));
    dataSourceConfig.setUrl(source.getString("url"));
    generator.setDataSource(dataSourceConfig);

    // 策略配置
    StrategyConfig strategyConfig =  new StrategyConfig();
    strategyConfig.setNaming(NamingStrategy.underline_to_camel);
    strategyConfig.setInclude(new String[]{ source.getString("tables")});
    generator.setStrategy(strategyConfig);

    // 包配置
    PackageConfig packageConfig = new PackageConfig();
    packageConfig.setParent(source.getString("parent"));
    packageConfig.setEntity("model.entity");
    packageConfig.setMapper("mapper");
    packageConfig.setService("service");
    packageConfig.setServiceImpl("service.impl");
    packageConfig.setXml("mapper");
    generator.setPackageInfo(packageConfig);

    generator.execute();
  }
}
