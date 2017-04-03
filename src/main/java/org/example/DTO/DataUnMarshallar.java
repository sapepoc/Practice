package org.example.DTO;

import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerConfigurationException;

import org.example.entities.Trades;
import org.example.exception.ReadException;
import org.springframework.stereotype.Component;

@Component
public interface DataUnMarshallar {
	
	

	public List<Trades> unmarshal(String data)throws ReadException, FileNotFoundException, TransformerConfigurationException;;

}
