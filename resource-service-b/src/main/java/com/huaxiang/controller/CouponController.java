package com.huaxiang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coupon")
public class CouponController {


    @RequestMapping("/list")
    public String list() {
        return "资源服务器B";
    }

}
