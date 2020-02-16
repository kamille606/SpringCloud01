package com.aaa.pyt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author :pyt
 * @Description :
 * @Version :
 * @Date :Created in 2020/1/9 14:49
 */
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun3081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun3081.class, args);
    }

}
