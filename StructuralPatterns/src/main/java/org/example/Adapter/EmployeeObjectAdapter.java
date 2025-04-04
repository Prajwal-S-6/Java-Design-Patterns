package org.example.Adapter;

/**
 * An object adapter. Using composition to translate interface
 */
public class EmployeeObjectAdapter implements Customer {
    private Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return this.employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.employee.getOfficeLocation();
    }
}
