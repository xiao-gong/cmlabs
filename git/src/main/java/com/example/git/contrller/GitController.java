package com.example.git.contrller;

import org.springframework.web.bind.annotation.*;

/**
 * todo:测试 git
 * @author xiaogong
 * @date  20200714
 */
@RestController("/git")
public class GitController {

    @GetMapping("/getGit")
    public String getGit(){
        return "git";
    }

    @DeleteMapping("/delGit")
    public void delGit(){
        return;
    }

    @PutMapping("/updateGit")
    public void updateGit(){
        return;
    }

    @GetMapping("/queryGit")
    public String queryGit(){
        return "queryGit2";
    }
}
