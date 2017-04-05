package org.example.transformer;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.example.entities.Trades;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class XMLTransformer implements DataTransformer {
	
	 public static void writeDocumentToFile(Document document, File file) throws TransformerException, JAXBException {


	        
	        
	    }
}
