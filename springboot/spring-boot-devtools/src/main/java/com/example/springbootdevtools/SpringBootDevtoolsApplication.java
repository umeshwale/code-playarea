package com.example.springbootdevtools;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBootDevtoolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDevtoolsApplication.class, args);
	}

	@Component
	public class ApplicationRuuner implements CommandLineRunner {

		@Override
		public void run(String... args) throws Exception {
			System.out.println("Just for the Devtools example Demo!");
		}
	}

}
