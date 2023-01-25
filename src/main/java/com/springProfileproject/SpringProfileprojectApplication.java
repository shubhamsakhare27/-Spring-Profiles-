package com.springProfileproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringProfileprojectApplication  implements CommandLineRunner {

	

    @Autowired
    private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(SpringProfileprojectApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		 System.out.println("Active profiles: " +
	                Arrays.toString(environment.getActiveProfiles()));
		
		
	}

	
	
	
}
