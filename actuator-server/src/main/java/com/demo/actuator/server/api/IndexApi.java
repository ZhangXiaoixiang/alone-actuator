package com.demo.actuator.server.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexApi
 *
 * @author 10905 2019/2/14
 * @version 1.0
 */
@RestController
public class IndexApi {
    @RequestMapping("/index")
    public String index(){
        return "监控中心首页";
    }
}
