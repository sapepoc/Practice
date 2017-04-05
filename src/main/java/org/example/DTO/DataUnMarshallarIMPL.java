package org.example.DTO;

import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.transform.TransformerConfigurationException;

import org.example.entities.Trades;
import org.example.exception.ReadException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

@Component
public class DataUnMarshallarIMPL implements DataUnMarshallar {
	  private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	public List<Trades> unmarshal(String data)	 {
		// TODO Auto-generated method stub
		logger.debug("Hi i am debug message");
		logger.info("Hi i am info message");
		logger.warn("Hi i am warn message");
		logger.error("Hi i am error message");
	throw new ReadException();
		//return null;
	}
	/*
	private Marshaller marshaller;
	private Marshaller marshaller;
	private Jaxb2Marshaller jaxb2Marshaller;
	
	public void marshall()
	{
		
		jaxb2Marshaller.setClassesToBeBound(classesToBeBound);
	
		marshaller.marshal(graph, result);
		
	}
	
	public void unMarshall()
	{
		unMarshaller.unmarshal(source);
		
	}
*/	
	
}