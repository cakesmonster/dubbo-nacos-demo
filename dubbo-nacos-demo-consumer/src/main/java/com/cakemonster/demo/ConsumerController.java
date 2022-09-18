package com.cakemonster.demo;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConsumerController
 *
 * @author cakemonster
 * @date 2022/9/18
 */
@RestController
public class ConsumerController {

    @DubboReference
    private DemoService demoService;

    @RequestMapping("/hello")
    public String hello() {
        return demoService.sayHello("张三");
    }
}
