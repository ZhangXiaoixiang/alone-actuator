package com.demo.alone.clinet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AloneClinetApplication {

    public static void main(String[] args) {
        SpringApplication.run(AloneClinetApplication.class, args);
        System.out.println("运行客户端,在服务器admin查看服务监控情况");
    }

}

