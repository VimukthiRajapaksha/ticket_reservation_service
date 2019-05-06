package edu.sliit.ds.assignment2.train_rest_api.service;

import java.util.List;


import edu.sliit.ds.assignment2.train_rest_api.model.Ticket;


public interface TicketService {

	public Ticket create(Ticket ticket);

	public List<Ticket> getAll();

	public Ticket findByPaymentId(String paymentId);

	public Ticket update(Ticket ticket);
}
