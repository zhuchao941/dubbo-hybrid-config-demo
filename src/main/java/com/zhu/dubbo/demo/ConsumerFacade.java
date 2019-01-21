package com.zhu.dubbo.demo;

import javax.annotation.Resource;
import org.springframework.context.annotation.Configuration;

/**
 * Created by @author zhuchao on @date 2019/1/21.
 */
@Configuration
public class ConsumerFacade {

    @Resource
    private DemoService demoService;
}
