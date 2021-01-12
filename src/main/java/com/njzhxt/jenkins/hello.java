package com.njzhxt.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：wj
 * @date ：Created in 2021/1/12 16:07
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class hello {
    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
}
