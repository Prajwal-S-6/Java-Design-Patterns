package org.example.chainofresponsibility;

//Abstract handler
public abstract class Employee implements LeaveApprover {

    private String role;

    private LeaveApprover leaveApprover;

    public Employee(String role, LeaveApprover leaveApprover) {
        this.role = role;
        this.leaveApprover = leaveApprover;
    }

    protected abstract boolean processRequest(LeaveApplication application);

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        if(!processRequest(application) && leaveApprover != null) {
            leaveApprover.processLeaveApplication(application);
        }
    }

    @Override
    public String getApproverRole() {
        return this.role;
    }
}