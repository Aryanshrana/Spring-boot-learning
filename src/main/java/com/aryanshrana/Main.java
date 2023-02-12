package com.aryanshrana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@SpringBootApplication
    //@EnableAutoConfiguration
    //@ComponentScan
    //@Configuration

@RestController
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class,args);
    }


}
