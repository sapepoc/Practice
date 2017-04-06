package org.example.DTO;

import java.util.List;



import org.example.entities.Trades;

import org.springframework.stereotype.Component;

@Component
public interface DataUnMarshallar {
	
	

	public List<Trades> unmarshal(String data);

}
