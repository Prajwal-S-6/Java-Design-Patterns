package org.example.interpreter;

//Non-terminal expression 
public class AndExpression implements PermissionExpression {

    PermissionExpression permissionExpression1;

    PermissionExpression permissionExpression2;

    public AndExpression(PermissionExpression permissionExpression1, PermissionExpression permissionExpression2) {
        this.permissionExpression1 = permissionExpression1;
        this.permissionExpression2 = permissionExpression2;
    }

    @Override
    public boolean interpret(User user) {
        return permissionExpression1.interpret(user) && permissionExpression2.interpret(user);
    }

    @Override
    public String toString() {
        return permissionExpression1 + "AND" + permissionExpression2;
    }
}
