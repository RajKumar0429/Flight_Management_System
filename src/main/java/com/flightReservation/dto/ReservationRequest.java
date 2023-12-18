package com.flightReservation.dto;

public class ReservationRequest {
	
	private long flightId;
	private String passengerFirstName;
	private String passengerLastName;
	private String passengerEmail;
	private String passengerMobile;
	private String cardNumber;
	private String cardHolderName;
	private String expirationDate;
	private String cvvCode;
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public String getPassengerFirstName() {
		return passengerFirstName;
	}
	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}
	public String getPassengerLastName() {
		return passengerLastName;
	}
	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public String getPassengerMobile() {
		return passengerMobile;
	}
	public void setPassengerMobile(String passengerMobile) {
		this.passengerMobile = passengerMobile;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getCvvCode() {
		return cvvCode;
	}
	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}
	
	
	
	

}
