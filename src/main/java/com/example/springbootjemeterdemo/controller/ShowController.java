package com.example.springbootjemeterdemo.controller;

import com.example.springbootjemeterdemo.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lenovo
 */
@RestController
@RequestMapping("/show")
@Slf4j
public class ShowController {
    /**
     * 测试hello
     *
     * @return hello show
     */
    @GetMapping("/hello")
    public String hello() {
        log.info("-------------------->hello()");
        return "hello show";
    }

    /**
     * 测试hello
     *
     * @return hello show
     */
    @PostMapping("/helloP")
    public Result<String> helloPost(String name) {
        log.info("-------------------->helloPost:{}", name);
        return new Result(true, 200, "hello Post" + name, null);
    }
    /**
     * 测试hello
     *
     * @return hello show
     */
    @PostMapping("/helloP2")
    public Result<String> helloPost2(String msg) {
        log.info("-------------------->helloPost2:{}", msg);
        return new Result(true, 200, "hello：------->" + msg, null);
    }
}
