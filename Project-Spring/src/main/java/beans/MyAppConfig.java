package com.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration  //Spring Configuration File
public class MyAppConfig {
 
    @Bean(name="helloWorld")
    public HelloWorld getMessage(){
        return new HelloWorld();
    }
}