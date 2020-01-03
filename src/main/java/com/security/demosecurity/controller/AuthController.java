package com.security.demosecurity.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AuthController {

    @PostMapping("/login")
    public JSONObject login(@RequestBody JSONObject jsonObject){
        System.err.println(jsonObject);
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("123","123");
        return jsonObject1;
    }
}
