package com.aaa.pyt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：pyt
 * @date ：Created in 2020/1/4 14:15
 * @version:
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ApplicationRun6083 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6083.class, args);
    }

}