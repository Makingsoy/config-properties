package com.example.producer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xudong
 * @description
 * @date 2021/5/4
 */
@RestController
public class Controller {
    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("hello。。。");
        return "hello。。。"+name+",这是producer";
    }
}
