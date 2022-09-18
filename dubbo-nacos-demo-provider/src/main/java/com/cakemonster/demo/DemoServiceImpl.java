package com.cakemonster.demo;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * DemoServiceImpl
 *
 * @author cakemonster
 * @date 2022/9/18
 */
@DubboService
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello " + name + " !";
    }
}
