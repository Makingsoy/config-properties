package com.example.consumer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xudong
 * @description
 * @date 2021/5/4
 */
@Component
public class RemoteImpl implements Remote {
    @Override
    public String hello1(@RequestParam("name") String name) {
        return "服务降级!!!!!!!!!!!";
    }
}
