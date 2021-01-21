package com.intalent.payment.service.model;

import java.util.Date;

public class Payment {
	
	private String firstName;

	private String lastName;
	
	private String phoneNumber;
	
	private String emailId;
	
	private String productId;
	
	private String productName;
	
	private Double txnAmt;
	
	private String txnCurrency;
	
	private Date txnDate;
	
	private String invoiceNumber;
	
	private PaymentMethod paymentMethod;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getTxnAmt() {
		return txnAmt;
	}

	public void setTxnAmt(Double txnAmt) {
		this.txnAmt = txnAmt;
	}

	public String getTxnCurrency() {
		return txnCurrency;
	}

	public void setTxnCurrency(String txnCurrency) {
		this.txnCurrency = txnCurrency;
	}

	public Date getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
}
