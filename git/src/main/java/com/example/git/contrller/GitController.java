package com.example.git.contrller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * todo:测试 git
 * @author xiaogong
 * @date  20200714
 */
@RestController("/git")
public class GitController {

    @RequestMapping("/getGit")
    public String getGit(){
        return "git";
    }

    @RequestMapping
    public void delGit(){
        return;
    }

    @RequestMapping
    public void updateGit(){
        return;
    }

    @RequestMapping
    public String queryGit(){
        return "queryGit";
    }
}
