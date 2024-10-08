package com.v1.consultorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.v1.controllers")
public class ConsultorioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsultorioApplication.class, args);
    }

}
