package com.shikun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/helloboot")
    @ResponseBody
    public String Handler01(){
        return "hello springboot";
    }
}
