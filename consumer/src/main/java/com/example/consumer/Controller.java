package com.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xudong
 * @description
 * @date 2021/5/4
 */
@RestController
public class Controller {

    @Autowired
    private Remote remote;

    @RequestMapping("/helloRemote/{name}")
    public String helloRemote(@PathVariable("name") String name){
        return remote.hello(name);
    }

}
