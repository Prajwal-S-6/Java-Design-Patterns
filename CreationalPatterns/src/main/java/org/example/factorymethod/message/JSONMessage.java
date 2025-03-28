package org.example.factorymethod.message;

public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}
	
}
