package com.aaa.pyt.springcloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConfigRest {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
