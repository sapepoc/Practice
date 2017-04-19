package org.example.DTO;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.example.entities.Trade;
import org.example.entities.Trades;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DataUnMarshallarIMPL implements DataUnMarshallar {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	ApplicationContext context;
	Marshaller marshaller;

	@Override
	public Trades unmarshal(File file, Class className) throws Exception {

		JAXBContext jaxbContext = JAXBContext.newInstance(className);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Trades trades = (Trades) unmarshaller.unmarshal(file);

		for (Trade trade : trades.getTradeList()) {

			System.out.println(trade.getUnderLying());
			System.out.println(trade.getPrice());
			System.out.println(trade.getVolume());
			System.out.println(trade.getDateTime());

		}
		System.out.println("unmarshalling done");
		return trades;

	}

}