package com.giz.infoseekdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bankId;
	private String name;
	private String code;
	private String incorporateDate;
	private int noOfStaff;
	private int noOfBranches;
	private String status;
	private double annualProfit;	
		
	
	public Bank(String name, String code, String incorporateDate, int noOfStaff, int noOfBranches, String status,
			double annualProfit) {
		super();
		this.name = name;
		this.code = code;
		this.incorporateDate = incorporateDate;
		this.noOfStaff = noOfStaff;
		this.noOfBranches = noOfBranches;
		this.status = status;
		this.annualProfit = annualProfit;
	}

	public Bank() {
		super();
	}	

	public double getAnnualProfit() {
		return annualProfit;
	}

	public void setAnnualProfit(double annualProfit) {
		this.annualProfit = annualProfit;
	}

	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIncorporateDate() {
		return incorporateDate;
	}
	public void setIncorporateDate(String incorporateDate) {
		this.incorporateDate = incorporateDate;
	}
	public int getNoOfStaff() {
		return noOfStaff;
	}
	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	public int getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
