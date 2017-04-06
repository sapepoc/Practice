package org.example.DTO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import org.example.entities.Trades;

import org.example.transformer.DataTransformer;
import org.example.transformer.XMLTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

@Component
public class DataUnMarshallarIMPL implements DataUnMarshallar {
	
	  private final Logger logger = LoggerFactory.getLogger(this.getClass());
	  
	  @Autowired
	  @Qualifier("XMLTransformer")
	  DataTransformer xMLTransformer;
	  
	@Override
	public List<Trades> unmarshal(String data)  {
		// TODO Auto-generated method stub
		
		Document document = null;
		File file=null;
		xMLTransformer.writeDocumentToFile(document, file);
		return null;

		
	}
	
	
}