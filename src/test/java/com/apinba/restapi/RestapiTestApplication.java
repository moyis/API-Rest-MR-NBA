package com.apinba.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiTestApplication {

    public static void main(String[] args) {
        SpringApplication.from(RestapiApplication::main)
                .with(TestcontainersConfiguration.class)
                .run(args);
    }

}