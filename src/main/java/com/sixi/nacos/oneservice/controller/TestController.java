package com.sixi.nacos.oneservice.controller;

import com.sixi.micro.common.utils.KeyValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 *
 * @Description: TODO
 * @Author:zhangchongfei
 * @Date:2019/8/30
 * @Time:15:15
 */
@RestController
public class TestController {
    @PostMapping("/test")
    public String test() {
        return "Hello Nacos";
    }
}
