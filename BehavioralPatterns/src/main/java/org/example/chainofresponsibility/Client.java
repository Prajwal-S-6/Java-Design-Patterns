package org.example.chainofresponsibility;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
	   LeaveApplication leaveApplication = LeaveApplication.getBuilder()
			   .withType(LeaveApplication.Type.PTO).from(LocalDate.now()).to(LocalDate.of(2025, 6, 4))
			   .build();
	   getLeaveApprover().processLeaveApplication(leaveApplication);
		System.out.println(leaveApplication.getStatus());
		System.out.println(leaveApplication.getProcessedBy());
	}

	public static Employee getLeaveApprover() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead projectLead = new ProjectLead(manager);

		return projectLead;
	}

	
}
