package com.demo.actuator.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class ActuatorServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorServerApplication.class, args);
        System.out.println("首页:  http://localhost:8080/index");
        System.out.println("admin首页:  http://localhost:8080");

    }

}

