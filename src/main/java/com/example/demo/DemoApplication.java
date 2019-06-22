package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.logging.*;

@SpringBootApplication
public class DemoApplication {


	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello shashi");
		Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO,"Welcome to Student Management application");

	}

}
