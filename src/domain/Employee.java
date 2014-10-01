package domain;

import java.util.Date;

public class Employee extends User {
	
	private Date employeeFrom;
	private Date employeeTo;
	private float salary;
	
	public Date getEmployeeFrom() {
		return employeeFrom;
	}
	
	public void setEmployeeFrom(Date employeeFrom) {
		this.employeeFrom = employeeFrom;
	}
	
	public Date getEmployeeTo() {
		return employeeTo;
	}
	
	public void setEmployeeTo(Date employeeTo) {
		this.employeeTo = employeeTo;
	}
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
