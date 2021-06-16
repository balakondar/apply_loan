package com.cts.bms.entity;

import org.springframework.data.annotation.Id;

public class Loan {
	@Id
	private Integer loanId;
	private String loanType;
	private String loanAmount;
	private String loanDate;
	private String loanRoi;
	private String loanDuration;
	private Integer customerId;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}
	public String getLoanRoi() {
		return loanRoi;
	}
	public void setLoanRoi(String loanRoi) {
		this.loanRoi = loanRoi;
	}
	public String getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(String loanDuration) {
		this.loanDuration = loanDuration;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
