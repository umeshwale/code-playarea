package com.example.springbootconcepts;

import com.example.springbootconcepts.annotation.components.TestComponentClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootConceptsApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication
				.run(SpringBootConceptsApplication.class, args);
		TestComponentClass testcomponent = ctx.getBean(TestComponentClass.class);
		int result = testcomponent.add(1,2);
		System.out.println("Addition of 1 and 2 = " + result);
	}

}
