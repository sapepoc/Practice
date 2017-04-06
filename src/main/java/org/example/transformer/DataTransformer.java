package org.example.transformer;

import java.io.File;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public interface DataTransformer {
	

	 public  void writeDocumentToFile(Document document, File file);
	 
}
