package org.example.flyweight;

public class Client {

	public static void main(String[] args) {
		SystemErrorMessage message = ErrorMessageFactory.getInstance().getErrorMessage(ErrorMessageFactory.ErrorType.GenericSystemError);
		System.out.println(message.getText("400"));

		UserBannedErrorMessage userBannedErrorMessage = ErrorMessageFactory.getInstance().getUserBannedMessage("101");
		System.out.println(userBannedErrorMessage.getText(null));
	}

}
