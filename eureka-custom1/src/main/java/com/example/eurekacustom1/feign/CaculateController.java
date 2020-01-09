package com.example.eurekacustom1.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vo.Result;

@RestController
public class CaculateController {

    @Autowired
    private  CaculateService caculateService;

    @GetMapping("/cadd")
    public Result cusAdd(int a, int b) {
        return caculateService.myadd(a, b);
    }
}
