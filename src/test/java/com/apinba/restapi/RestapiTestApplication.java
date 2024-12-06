package com.apinba.restapi;

import org.springframework.boot.SpringApplication;

public class RestapiTestApplication {

  public static void main(String[] args) {
    SpringApplication.from(RestapiApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
