package org.example.NullObject;

public class Client {

	public static void main(String[] args) {
//		ComplexService service = new ComplexService("Simple report",new StorageService());
//		service.generateReport();

		ComplexService service1 = new ComplexService("Simple report",new NullStorageService());
		service1.generateReport();
		
	}

}
