package com.aaa.pyt.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author :pyt
 * @Description :
 * @Version :
 * @Date :Created in 2020/1/7 15:13
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.aaa.pyt.springcloud.mapper")
@EnableCircuitBreaker
public class ApplicationRun8084 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8084.class, args);
    }

}
