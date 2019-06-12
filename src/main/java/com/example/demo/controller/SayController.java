package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/6/12 16:54
 */
//@RestController
@RestController
//@RequestMapping指定映射路径
@RequestMapping("say")
public class SayController {

    @GetMapping//GET请求 //@RequestParam("word") 获取一个word=参数
    public String say(@RequestParam("word") String word) {
        return word;
    }
}
