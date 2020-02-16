package com.aaa.pyt.springcloud.service;

import com.aaa.pyt.springcloud.fallback.ISpringCloudFallbackFactory;
import com.aaa.pyt.springcloud.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author :pyt
 * @date :Created in 2020/1/4 14:19
 * @version :
 * @description :
 */
@FeignClient(value = "BOOK-PROVIDER", fallbackFactory = ISpringCloudFallbackFactory.class)
public interface ISpringCloudService {

    @GetMapping("/selectAll")
    List<Student> selectAll();

}
