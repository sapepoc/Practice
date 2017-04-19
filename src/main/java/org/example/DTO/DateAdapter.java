package org.example.DTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, LocalDateTime> {

	@Override
	public LocalDateTime unmarshal(String dateTime) throws Exception {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime localDateTime = LocalDateTime.parse(dateTime, formatter);
		return localDateTime;
	}

	@Override
	public String marshal(LocalDateTime dateTime) throws Exception {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = dateTime.format(formatter);
		return formattedDateTime;
	}

}
