package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

//Flyweight factory. Returns shared flyweight based on key
public class ErrorMessageFactory {
	
	//This serves as key for getting flyweight instance
	public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}
	
	private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

	private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

	public static ErrorMessageFactory getInstance() {
		return FACTORY;
	}
	
	private ErrorMessageFactory() {
		errorMessages.put(ErrorType.GenericSystemError,
				new SystemErrorMessage("A generic error of type $errorCode occured. Please refer to: \n", "http://google.com/q="));
		errorMessages.put(ErrorType.PageNotFoundError,
				new SystemErrorMessage("Page not found. An error of type $errorCode occured. Please refer to: \n", "http://google.com/q="));
	}


	public SystemErrorMessage getErrorMessage(ErrorType type) {
		return errorMessages.get(type);
	}
	
	public UserBannedErrorMessage getUserBannedMessage(String caseId) {
		return new UserBannedErrorMessage(caseId);
	}
}
