package com.wxf.controller;

import com.wxf.client.Testclient;
import com.wxf.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {
    //TESTgit
    @Autowired
    Testclient testclient;
    @RequestMapping("/test")
    public String  hellWorld(@RequestParam("str") String str){
        return testclient.helloWorld(str);
    }
    @RequestMapping("/testPost")
    public String testPost(@RequestBody TestVo testVo){
        return testclient.testPost(testVo);
    }
}
