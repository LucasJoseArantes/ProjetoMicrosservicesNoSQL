package com.iftm.startexample.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class StartexampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartexampleApplication.class, args);
    }
}
