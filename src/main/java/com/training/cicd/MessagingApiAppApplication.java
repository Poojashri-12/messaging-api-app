package com.training.cicd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessagingApiAppApplication {
	
	
	
	@Autowired
	printHello printHello;
	
	@GetMapping("enjoyWeekend")
	public String getName() {
		return printHello.printGreetings();
	}
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		System.out.println(printGreetings());
		
		
	}
	public static String printGreetings() {
		return "Hi Oracle!!";
	}

}
