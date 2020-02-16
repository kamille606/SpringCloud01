package com.aaa.pyt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：pyt
 * @date ：Created in 2020/1/3 16:40
 * @version: 5
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun6082 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class, args);
    }

}
