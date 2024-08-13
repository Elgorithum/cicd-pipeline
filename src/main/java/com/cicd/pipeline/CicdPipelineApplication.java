package com.cicd.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdPipelineApplication {


    @GetMapping("/hello")
    public String hi() {
        return "welcome to ku8 ";
    }
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/Elgorithum/cicd-pipeline.git
//    git push -u origin main
    public static void main(String[] args) {
        SpringApplication.run(CicdPipelineApplication.class, args);
    }
}
