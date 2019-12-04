package com.spikes.cinemaz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemazApplication {

    public static void main(String[] args) {
        System.out.println("ARGS " + args);
        SpringApplication.run(CinemazApplication.class, args);
    }

}