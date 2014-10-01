package domain;

import java.util.Date;

public class Salary {
	
	private float salary;
	private Date salaryFrom;
	private Date salaryTo;
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Date getSalaryFrom() {
		return salaryFrom;
	}
	
	public void setSalaryFrom(Date salaryFrom) {
		this.salaryFrom = salaryFrom;
	}
	
	public Date getSalaryTo() {
		return salaryTo;
	}
	
	public void setSalaryTo(Date salaryTo) {
		this.salaryTo = salaryTo;
	}
}
