package com.example.springbootapplicationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBootApplicationContextApplication {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationContextApplication.class, args);
	}

	@Component
	public class ApplicationRunner implements CommandLineRunner {

		@Override
		public void run(String... args) throws Exception {
			System.out.println(applicationContext.getDisplayName());
			System.out.println(applicationContext.getId());

			MyBean myBean = applicationContext.getBean(MyBean.class);
			System.out.println("My Bean Application ID : "+myBean.getApplicationId());

		}
	}

}
