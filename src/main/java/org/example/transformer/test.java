package org.example.transformer;

import static org.junit.Assert.*;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;

import org.junit.Test;

public class test {

	@Test
	public void test() {
	
		XMLTransformer xMLTransformer = new XMLTransformer();
		try {
			xMLTransformer.writeDocumentToFile(null, null);
		
			
		} catch (TransformerException | JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
