package org.example.DTO;

import java.util.List;



import org.example.entities.Trade;

import org.springframework.stereotype.Component;

@Component
public interface DataUnMarshallar {
	
	

	public List<Trade> unmarshal(String data);

}
