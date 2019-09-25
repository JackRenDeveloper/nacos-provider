package com.elvis.provide.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${username:JackRenDeveloper}")
    private String username;

    @RequestMapping("/username")
    public String get() {
        return username;
    }

}
