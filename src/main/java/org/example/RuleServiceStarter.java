package org.example;

import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamException;

import org.example.DTO.DataUnMarshallar;
import org.example.DTO.DataUnMarshallarIMPL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RuleServiceStarter {

	public static void main(String[] args) {
		SpringApplication.run(RuleServiceStarter.class, args);
		System.out.println("Hi");
		DataUnMarshallar unmarshallar  = new DataUnMarshallarIMPL();
		try {
			unmarshallar.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
