package com.aaa.pyt.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：pyt
 * @date ：Created in 2020/1/3 15:35
 * @version: 1
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.aaa.pyt.springcloud.mapper")
public class ApplicationRun8082 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8082.class, args);
    }

}
