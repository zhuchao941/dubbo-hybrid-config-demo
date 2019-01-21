package com.zhu.dubbo.demo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by @author zhuchao on @date 2019/1/21.
 */
@SpringBootApplication
@EnableDubbo(multipleConfig = true)
@ImportResource("META-INF/spring/*")
public class Consumer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Consumer.class).web(false).run(args);
    }
}
