package org.example.DTO;

import java.io.File;
import java.util.List;
import org.example.entities.Trade;
import org.example.transformer.DataTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

@Component
public class DataUnMarshallarIMPL implements DataUnMarshallar {
	
	  private final Logger logger = LoggerFactory.getLogger(this.getClass());
	  
	  @Autowired
	  @Qualifier("XMLTransformer")
	  DataTransformer xMLTransformer;
	  
	@Override
	public List<Trade> unmarshal(String data)  {
		// TODO Auto-generated method stub
		
		Document document = null;
		File file=null;
		xMLTransformer.writeDocumentToFile(document, file);
		return null;

		
	}
	
	
}