package org.example.DTO;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.example.Entities.Trades;

public class DataUnMarshallarIMPL implements DataUnMarshallar {

	Trades trade;
	boolean bstartTime = false;
	boolean bendTime = false;
	boolean btradeValue = false;

	public void read() throws FileNotFoundException, XMLStreamException {

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("files/Input.xml").getFile());
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();

		InputStream in = new FileInputStream(file);		
		XMLEventReader eventReader = inputFactory.createXMLEventReader(in);

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

	}
}