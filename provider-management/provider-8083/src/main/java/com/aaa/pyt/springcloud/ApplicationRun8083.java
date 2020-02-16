package com.aaa.pyt.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：pyt
 * @date ：Created in 2020/1/3 15:40
 * @version: 2
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.aaa.pyt.springcloud.mapper")
public class ApplicationRun8083 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8083.class, args);
    }

}
