package com.company.singleresp.after;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    
    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        
        User user = mapper.readValue(userJson, User.class);
        boolean isValidUser = UserValidator.validateUser(user);
        if(!isValidUser) {
            return "ERROR";
        }

        UserPersistenceService.storeUserdata(user);
        
        return "SUCCESS";
    } 



}