package com.intalent.payment.service.model;

public class PaymentMethod {
	
	private String paymentType;
	
	private String nameOnPaymentMethod;
	
	private Card card;
	
	private BankAccount bankAccount;
	
	private Address address;

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getNameOnPaymentMethod() {
		return nameOnPaymentMethod;
	}

	public void setNameOnPaymentMethod(String nameOnPaymentMethod) {
		this.nameOnPaymentMethod = nameOnPaymentMethod;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
