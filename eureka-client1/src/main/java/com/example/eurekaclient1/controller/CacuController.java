package com.example.eurekaclient1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.ResultUtil;
import vo.Result;

import javax.annotation.Resource;

@RestController
@RequestMapping("/cacu")
public class CacuController {
    @Resource
    private DiscoveryClient discoveryClient;
    private Logger log = LoggerFactory.getLogger(CacuController.class);
    @GetMapping("/add")
    public Result add(int a, int b) {
        log.info("client 1 is call :{}",discoveryClient.description());
        return ResultUtil.success(a+b+" cacuby1");
    }

}
