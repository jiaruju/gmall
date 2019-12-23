package com.atguigu.gmall.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1.配置整合dubbo
 * 2.配置整合MybatisPlus
 *
 * logstash整合：
 *      1.导jar包logstash-logback-encoder
 *      2.导入日志配置logback-spring.xml
 *      3.在kibana里面的discover建立好索引,就可以进行日志可视化检索
 */

@EnableDubbo
@MapperScan(basePackages = "com.atguigu.gmall.pms.mapper")
@SpringBootApplication
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}
