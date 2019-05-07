package edu.sliit.ds.assignment2.train_rest_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.sliit.ds.assignment2.train_rest_api.model.Ticket;


@Repository
public interface TicketRepository extends MongoRepository<Ticket, String>{
	//public Ticket findTicketByPaymentId(String payId);
	public Ticket findByPaymentId(String paymentId);

}
