package org.example.entities;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.example.DTO.DateAdapter;

@XmlRootElement(name = "Trade")
public class Trade {

	private String type;
	private double price;
	private int volume;
	private String underLying;
	private LocalDateTime dateTime;
	
	@XmlElement(name = "Time")
	@XmlJavaTypeAdapter(DateAdapter.class)
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}



	@XmlElement(name = "Type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@XmlElement(name = "Price")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@XmlElement(name = "volume")
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@XmlElement(name = "Underlying")
	public String getUnderLying() {
		return underLying;
	}

	public void setUnderLying(String underLying) {
		this.underLying = underLying;
	}

}
