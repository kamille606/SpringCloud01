package com.aaa.pyt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author :pyt
 * @Description :
 * @Version :
 * @Date :Created in 2020/1/8 20:59
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApplicationRun5081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun5081.class, args);
    }

}
