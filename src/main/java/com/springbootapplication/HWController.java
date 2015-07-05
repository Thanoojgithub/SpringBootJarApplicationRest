package com.springbootapplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HWController {
	
	@Value("${name}")
	private String name;

	@RequestMapping("/sayHello")
    String sayHello(@RequestParam("name") String name) {
        return "Hello " +name+"!";
    }

	@RequestMapping("/sayName")
    String sayName() {
        return "Hello " +this.name+"!";
    }
	
	@RequestMapping("/")
    String sayHello() {
        return "Hello World!";
    }
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HWController.class, args);
    }
}
