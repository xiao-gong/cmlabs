package com.example.git.contrller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/java")
public class JavaController {

    @RequestMapping("/getJava")
    public void getJava(){
        return;
    }
}
