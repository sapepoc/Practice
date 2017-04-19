package org.example;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.example.entities.Trade;
import org.example.entities.Trades;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FxTradingApplicationTests {

	@Test
	public void contextLoads() throws Exception {/*

		JAXBContext jaxbContext = JAXBContext.newInstance(Trades.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		Trades trades = (Trades) jaxbUnmarshaller.unmarshal(new File("D:/test.xml"));

		for (Trade trade : trades.getTradeList()) {
			System.out.println(trade.getId());
			System.out.println(trade.getTraderName());
		}
	*/}

}
