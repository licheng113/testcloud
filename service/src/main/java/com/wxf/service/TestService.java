package com.wxf.service;

import com.wxf.vo.TestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestService {
     public String hellWorld(String str){
         log.info("service ------"+str);
         return str;
     }
    public  String testPost(TestVo testVo) {
        return testVo.toString();
    }
}
