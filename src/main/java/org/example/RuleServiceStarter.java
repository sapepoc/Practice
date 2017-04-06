package org.example;

import org.example.DTO.DataUnMarshallarIMPL;
import org.example.controller.RuleServiceController;
import org.example.errorhandling.FXErrorCodes;
//import org.example.configuration.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
