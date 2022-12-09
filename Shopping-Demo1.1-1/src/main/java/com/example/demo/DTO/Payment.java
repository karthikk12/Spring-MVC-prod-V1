package com.example.demo.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

//payId, cardNumber, cardName, cardPhoneNumber, custId

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payId")
	private int paymentId;

	@Column(name = "cardNumber")
	@Embedded
	private CardDetails cardNumber;

	@Column(name = "cardName")
	private String cardName;

	@Column(name = "cardPhoneNumber")
	private String CardPhoneNumber;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "custId")
	private Customer customer;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public CardDetails getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(CardDetails cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardPhoneNumber() {
		return CardPhoneNumber;
	}

	public void setCardPhoneNumber(String cardPhoneNumber) {
		CardPhoneNumber = cardPhoneNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", cardNumber=" + cardNumber + ", cardName=" + cardName
				+ ", CardPhoneNumber=" + CardPhoneNumber + ", customer=" + customer + "]";
	}

}
