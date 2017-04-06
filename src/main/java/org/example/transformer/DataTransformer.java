package org.example.transformer;

import java.io.File;


import org.w3c.dom.Document;

public interface DataTransformer {
	

	 public  void writeDocumentToFile(Document document, File file);
	 
}
