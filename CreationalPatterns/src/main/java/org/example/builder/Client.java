package org.example.builder;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withBirthday(user.getBirthday()).withAddress(user.getAddress());
		System.out.println(builder.build());


		Computer myComputer = new Computer.ComputerBuilder().withCPU("Intel i7").withRAM("16GB").withStorage("1TB SSD").withGPU("3060Ti").build();
		System.out.println(myComputer);
	}
	
	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}
