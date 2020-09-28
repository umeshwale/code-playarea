package com.example.springbootcmdLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBootCmdLineRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCmdLineRunnerApplication.class, args);
	}

}
