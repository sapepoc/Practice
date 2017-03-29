package org.example.DTO;

import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamException;

public interface DataUnMarshallar {
	
	public void read() throws FileNotFoundException, XMLStreamException;

}
