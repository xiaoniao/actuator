package com.liuzhuang.actuator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuzz on 2017/8/7.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
