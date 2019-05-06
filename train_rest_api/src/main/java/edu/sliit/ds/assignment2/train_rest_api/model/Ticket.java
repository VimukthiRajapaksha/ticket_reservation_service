package edu.sliit.ds.assignment2.train_rest_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = 	"ticket")
public class Ticket {
	
	@Id
	String ticketId;
	String date;
	String from;
	String to;
	int ticket_class;//1st(AC),2nd, 3rd
	String price;
	String paymentId;
	
	Ticket(){
		
	}
	
	Ticket(String ticketId,String date,String from,String to,int ticket_class,String price,String paymentId){
		this.ticketId  = ticketId;
		this.date = date;
		this.from = from;
		this.to = to;
		this.ticket_class = ticket_class;
		this.price = price;
		this.paymentId = paymentId;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getTicket_class() {
		return ticket_class;
	}
	public void setTicket_class(int ticket_class) {
		this.ticket_class = ticket_class;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	
	
	

}
