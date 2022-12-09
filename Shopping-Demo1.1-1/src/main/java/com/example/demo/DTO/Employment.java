package com.example.demo.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employment")
public class Employment {

	// empId, companyName, designation, salary, companyLocation, jobPosition, custId

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empId")
	private int employeeId;

	@Column(name = "companyName")
	private String companyName;

	@Column(name = "designation")
	private String designation;

	@Column(name = "salary")
	private int salary;

	@Column(name = "companyLocation")
	private String companyLocation;

	@Column(name = "jobPosition")
	private String jobPosition;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "custId")
	private Customer customer;

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Employment [employeeId=" + employeeId + ", companyName=" + companyName + ", designation=" + designation
				+ ", salary=" + salary + ", companyLocation=" + companyLocation + ", jobPosition=" + jobPosition
				+ ", customer=" + customer + "]";
	}

}
