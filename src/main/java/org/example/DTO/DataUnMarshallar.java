package org.example.DTO;

import java.io.File;
import java.util.List;



import org.example.entities.Trade;
import org.example.entities.Trades;
import org.springframework.stereotype.Component;

@Component
public interface DataUnMarshallar {
	
	

	public Trades unmarshal(File file,Class className) throws Exception;

}
