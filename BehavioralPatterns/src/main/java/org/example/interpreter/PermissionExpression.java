package org.example.interpreter;

//Abstract expression
public interface PermissionExpression {

	boolean interpret(User user); 
}
