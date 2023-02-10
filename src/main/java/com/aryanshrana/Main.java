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
    @GetMapping("/greet")
    public GreetResponse greet(){

        return new GreetResponse(
                "Hello Aryansh",
                List.of("Java","javascript","Golang","Kotlin"),
                new Person("Aryansh",21,8000)
        );
    }

    record Person(String name,int age,double savings){}
    record GreetResponse(
            String greet,
            List<String> favprogramminglanguages,
            Person person
    ){}

    /*class GreetResponse{
        private final String greet;

        GreetResponse(String greet){
            this.greet = greet;
        }

        public String getGreet(){
            return greet;
        }
    }*/
}
