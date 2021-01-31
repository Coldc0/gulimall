package com.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.gulimall.product.dao")
/**
 * Mybatis-plus
 * 1.导入依赖
 * 2.配置数据源
 * 3.@MapperScan
 *
 * 逻辑删除：pms_cateogry表中的show_status
 * 1. 配置全局逻辑删除规则（跳过）
 * 2. 配置组件（跳过）
 * 3. 配置注解@TableLogic
 */

public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
