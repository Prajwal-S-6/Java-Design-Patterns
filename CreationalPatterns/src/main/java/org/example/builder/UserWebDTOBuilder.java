package org.example.builder;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
//TODO implement builder
public class UserWebDTOBuilder implements UserDTOBuilder {
    String firstName;
    String lastname;
    String age;
    Address address;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lastname = lname;
        return this;
    }

    public String getName() {
        return this.firstName + " " + this.lastname;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        this.age = Integer.toString(Period.between(LocalDate.now() , date).getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public UserDTO build() {
        UserDTO userDTO= new UserWebDTO(getName(), address.toString(), age);
        return userDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return null;
    }
}
