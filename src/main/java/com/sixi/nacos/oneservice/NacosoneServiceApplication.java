package com.sixi.nacos.oneservice;

import org.springframework.boot.SpringApplication;

import com.sixi.micro.common.annotation.SixiMicroServiceApplication;

/**
 * @author zhangchongfei
 */
@SixiMicroServiceApplication
public class NacosoneServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosoneServiceApplication.class, args);
    }
}
