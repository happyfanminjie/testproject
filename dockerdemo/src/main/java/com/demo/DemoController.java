package com.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanminjie
 * @ClassName DemoController
 * @Description TODO
 * @date 2020-03-08 23:56
 * @Version 1.0
 */
@RestController
@RequestMapping("/")
public class DemoController {

    @RequestMapping("/test/{str}")
    public String test(@PathVariable String str){
        return "success: " + str;
    }

}
