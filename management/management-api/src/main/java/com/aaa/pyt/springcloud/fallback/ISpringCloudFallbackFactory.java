package com.aaa.pyt.springcloud.fallback;

import com.aaa.pyt.springcloud.model.Student;
import com.aaa.pyt.springcloud.service.ISpringCloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author :pyt
 * @Description :
 * @Version :
 * @Date :Created in 2020/1/7 15:29
 */
@Component
public class ISpringCloudFallbackFactory implements FallbackFactory<ISpringCloudService> {
    @Override
    public ISpringCloudService create(Throwable throwable) {
        ISpringCloudService springCloudService = new ISpringCloudService() {
            @Override
            public List<Student> selectAll() {
                System.out.println("熔断成功");
                return null;
            }
        };
        return springCloudService;
    }
}
