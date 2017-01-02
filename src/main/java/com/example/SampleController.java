package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiJingjing on 1/1/17.
 */

@RestController
@RequestMapping("/test")
public class SampleController {

    @GetMapping("/")
    public String hello() {
        return "Hello Fang & Jingjing, - Happy New Year !!! ";
    }

}