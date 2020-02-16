package com.aaa.pyt.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.aaa.pyt.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun8081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8081.class,args);
    }

}
