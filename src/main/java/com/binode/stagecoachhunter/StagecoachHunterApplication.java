package com.binode.stagecoachhunter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StagecoachHunterApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StagecoachHunterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welcome to Stagecoach Hunter: A Ride sharing app in  Dystopian Wild West!!");
    }
}
