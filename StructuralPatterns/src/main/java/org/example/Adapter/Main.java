package org.example.Adapter;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/
		// I am using employeeClassAdapter as of type Employee and Customer hence two-way adapter
		BusinessCardDesigner cardDesigner = new BusinessCardDesigner();
		EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
		populateEmployeeData(employeeClassAdapter);
		System.out.println(cardDesigner.designCard(employeeClassAdapter));

		System.out.println("-------------------------------------------------------------------------------------");
		
		/** Using Object Adapter **/
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
		cardDesigner.designCard(employeeObjectAdapter);
		System.out.println(cardDesigner.designCard(employeeObjectAdapter));
		
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
