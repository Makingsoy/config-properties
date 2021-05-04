package com.example.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xudong
 * @description
 * @date 2021/5/4
 */
@FeignClient(name = "producer",fallback=RemoteImpl.class)
public interface Remote {
    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name);
}
