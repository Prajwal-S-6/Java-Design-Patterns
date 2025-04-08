package org.example.chainofresponsibility;

//A concrete handler
public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover nextApprover) {
        super("Project Lead", nextApprover);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        if(application.getType().equals(LeaveApplication.Type.Sick)) {
            if(application.getNoOfDays() < 2) {
                application.approve("Project-Lead");
                return true;
            }
        }

        return false;
    }
}
