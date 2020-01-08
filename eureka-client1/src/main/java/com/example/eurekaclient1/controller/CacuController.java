package com.example.eurekaclient1.controller;

import com.example.eurekaclient1.util.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cacu")
public class CacuController {

    @GetMapping("/add")
    public Object add(int a,int b) {
        return ResultUtil.success(a+b+" cacuby1");
    }

}
