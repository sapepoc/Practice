package org.example.DTO;

import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.transform.TransformerConfigurationException;

import org.example.entities.Trades;
import org.example.exception.ReadException;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

@Component
public class DataUnMarshallarIMPL implements DataUnMarshallar {

	@Override
	public List<Trades> unmarshal(String data)
			throws ReadException {
		// TODO Auto-generated method stub
		throw new ReadException();
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