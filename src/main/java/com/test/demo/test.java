package com.test.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author THLiu
 */
@RestController
public class test {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "Hello World！！！！";
    }
}
