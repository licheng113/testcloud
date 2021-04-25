package com.wxf.client;

import com.wxf.vo.TestVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@FeignClient("service")
public interface Testclient {
    @RequestMapping("/test")
    String helloWorld(@RequestParam("str") String str);
    @RequestMapping("/testPost")
    String testPost(TestVo testVo);
}
