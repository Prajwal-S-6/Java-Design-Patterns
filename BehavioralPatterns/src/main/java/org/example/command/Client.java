package org.example.command;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();
		Command addMemberCommand = new AddMemberCommand("admin@admin.com", "spam" , service);
		MailTasksRunner.getInstance().addCommand(addMemberCommand);

		Command addMemberCommand2 = new AddMemberCommand("user@user.com", "spam" , service);

		MailTasksRunner.getInstance().addCommand(addMemberCommand2);

		Thread.sleep(3000);

		MailTasksRunner.getInstance().shutdown();


	}

}
