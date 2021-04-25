package com.wxf.controller;

import com.wxf.service.TestService;
import com.wxf.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @Autowired
    TestService testService;
    @RequestMapping("/test")
    public String  helloWorld (@RequestParam("str") String str){
        return  testService.hellWorld(str);
    }
    @RequestMapping("/testPost")
    public String testPost(@RequestBody TestVo testVo){
        return testService.testPost(testVo);
    }
}
