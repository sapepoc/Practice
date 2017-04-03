package org.example;

import org.example.DTO.DataUnMarshallarIMPL;
import org.example.controller.RuleServiceController;
//import org.example.configuration.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class RuleServiceStarter implements CommandLineRunner {

	@Autowired
	RuleServiceController ruleServiceController;

	public static void main(String[] args) {

		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(AppConfig.class);

		SpringApplication.run(RuleServiceStarter.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		ruleServiceController.start();

	}

}
