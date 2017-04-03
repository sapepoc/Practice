package org.example.DTO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

import org.example.entities.Trades;
import org.example.exception.ReadException;
import org.springframework.stereotype.Component;

@Component
public class DataUnMarshallarIMPL implements DataUnMarshallar {

	//private boolean condition=false;
	/*
	  private Marshaller marshaller;
	    private Unmarshaller unmarshaller;
*/
	 
	// InputStream xsltFile=JAXBConvertor.class.getResourceAsStream("transform-0-1.xslt");
	/*Trades trade = new Trades();


	boolean bstartTime = false;
	boolean bendTime = false;
	boolean btradeValue = false;

	private void read() throws FileNotFoundException, XMLStreamException,ReadException{

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("files/nput.xml").getFile());
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();

		InputStream in = new FileInputStream(file);
		XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
		`

		while (eventReader.hasNext()) {

			XMLEvent event = eventReader.nextEvent();
			switch (event.getEventType()) {
			case XMLStreamConstants.START_ELEMENT:
				StartElement startElement = event.asStartElement();
				String qName = startElement.getName().getLocalPart();
				if (qName.equalsIgnoreCase("Trade")) {
					Iterator<Attribute> attributes = startElement.getAttributes();
					while (attributes.hasNext()) {
						Attribute attribute = attributes.next();
						if (attribute.getName().toString().equals("id")) {
							trade.setId(attribute.getValue());
							System.out.println("Trader id = " + attribute.getValue());
						}
						break;
					}
				}

				else if (qName.equalsIgnoreCase("SartTime")) {
					bstartTime = true;
				} else if (qName.equalsIgnoreCase("EndTime")) {
					bendTime = true;
				} else if (qName.equalsIgnoreCase("TradeValue")) {
					btradeValue = true;
				}
				break;

			case XMLStreamConstants.CHARACTERS:
				Characters characters = event.asCharacters();
				if (bstartTime) {
					System.out.println("Start Time: " + characters.getData());
					bstartTime = false;
				}
				if (bendTime) {
					System.out.println("End Time: " + characters.getData());
					bendTime = false;
				}

			}

		}
		throw new ReadException();

	}*/

	
	@Override
	public List<Trades> unmarshal(String data) throws ReadException, FileNotFoundException, TransformerConfigurationException {

		/*if(condition)
		{
		throw new ReadException();
		}*/
		

		TransformerFactory tf = TransformerFactory.newInstance();
		StreamSource xsl = new StreamSource("files/Input.xsl");
		StreamSource xml = new StreamSource("files/Input.xml");
		Transformer transformer = tf.newTransformer(xsl);
	//	transformer.transform(xml, outputTarget);
		
		return null;

		
	}
}