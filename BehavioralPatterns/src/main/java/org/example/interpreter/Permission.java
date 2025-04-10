package org.example.interpreter;

//Terminal expression
public class Permission implements PermissionExpression{

    String permission;

    public Permission(String permission) {
        this.permission = permission;
    }

    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(this.permission);
    }

    @Override
    public String toString() {
        return permission;
    }
}
