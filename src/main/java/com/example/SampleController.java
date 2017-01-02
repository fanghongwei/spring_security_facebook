package com.example;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
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

        OAuth2Authentication oAuth2Authentication =
                (OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication();

        Authentication userAuthentication = oAuth2Authentication.getUserAuthentication();

        System.out.println("######################");
        System.out.println(userAuthentication.getDetails());
        System.out.println("######################");

        return "Hello Fang & Jingjing, - Happy New Year !!!  (" + userAuthentication.getName() + ")";
    }

}