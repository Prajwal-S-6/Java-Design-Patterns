package org.example.interpreter;

public class Client {

	public static void main(String[] args) {

		Report report = new Report("Report1", "FINANCE_USER AND ADMIN");

		ExpressionBuilder builder = new ExpressionBuilder();
		PermissionExpression permissionExpression = builder.build(report);
		System.out.println(permissionExpression);

		User user = new User("Prajwal", "FINANCE_USER", "ADMIN");
		boolean access = permissionExpression.interpret(user);
		System.out.println("User can access the report:" + access);


	}

}
