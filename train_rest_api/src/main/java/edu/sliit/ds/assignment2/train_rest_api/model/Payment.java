package edu.sliit.ds.assignment2.train_rest_api.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = 	"document")
public class Payment {
	
	@Id
	String payId;
	String type;//Mobile / credit card
	String date;
	double amount;
	String mobile;
	int pin;//pin for mobile users 4 digit number
	long cardNumber;
	int cvc;//at the back of the credit card (3 digits)
	String cardHolderName;
	String nic;
	
	public Payment(){
	}
	
	Payment(String type,String date,double amount,String mobile,int pin,String nic){
		this.type=type;
		this.date=date;
		this.amount=amount;
		this.mobile=mobile;
		this.pin=pin;
		this.nic=nic;
	}
	
	Payment(String type,String date,double amount,long cardNumber,int cvc,String cardHolderName,String nic){
		this.type=type;
		this.date=date;
		this.amount=amount;
		this.cardNumber=cardNumber;
		this.cvc=cvc;
		this.cardHolderName=cardHolderName;
		this.nic=nic;
	}
	
	Payment(String type,String date,double amount,String mobile,int pin,long cardNumber,int cvc,String cardHolderName,String nic){
		this.type=type;
		this.date=date;
		this.amount=amount;
		this.mobile=mobile;
		this.pin=pin;
		this.cardNumber=cardNumber;
		this.cvc=cvc;
		this.cardHolderName=cardHolderName;
		this.nic=nic;
	}
	
	Payment(String payId,String type,String date,double amount,String mobile,int pin,String nic){
		this.payId=payId;
		this.type=type;
		this.date=date;
		this.amount=amount;
		this.mobile=mobile;
		this.pin=pin;
		this.nic=nic;
	}
	
	Payment(String payId,String type,String date,double amount,long cardNumber,int cvc,String cardHolderName,String nic){
		this.payId=payId;
		this.type=type;
		this.date=date;
		this.amount=amount;
		this.cardNumber=cardNumber;
		this.cvc=cvc;
		this.cardHolderName=cardHolderName;
		this.nic=nic;
	}
	
	Payment(String payId,String type,String date,double amount,String mobile,int pin,long cardNumber,int cvc,String cardHolderName,String nic){
		this.payId=payId;
		this.type=type;
		this.date=date;
		this.amount=amount;
		this.mobile=mobile;
		this.pin=pin;
		this.cardNumber=cardNumber;
		this.cvc=cvc;
		this.cardHolderName=cardHolderName;
		this.nic=nic;
	}
	
	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{payId: " + payId + 
				"	type: " + type + 
				"	date: " + date +
				"	amount: " + amount + 
				"	mobile: "+ mobile + 
				"	pin: " + pin + 
				"	cardNumber: " + cardNumber + 
				"	cvc: " + cvc +
				"	cardHolderName: " +cardHolderName +
				"	nic: " +nic +"}";
	}
	
	
}
