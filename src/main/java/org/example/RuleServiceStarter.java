package org.example;


import org.example.controller.RuleServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
//@ImportResource({ "classpath:applicationContext.xml" })
public class RuleServiceStarter implements CommandLineRunner {

	@Autowired
	RuleServiceController ruleServiceController;

	public static void main(String[] args) {
			

		SpringApplication.run(RuleServiceStarter.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Service started");
		ruleServiceController.start();
	

	}

}
