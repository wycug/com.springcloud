package com.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther wy
 * @create 2021/11/9 17:14
 */

@Configuration
@MapperScan("com.springcloud.dao")
public class MyBatisConfig {
}
