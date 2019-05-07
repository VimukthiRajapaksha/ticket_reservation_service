package edu.sliit.ds.assignment2.train_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.sliit.ds.assignment2.train_rest_api.model.Ticket;
import edu.sliit.ds.assignment2.train_rest_api.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@RequestMapping(method = RequestMethod.GET, produces = { "application/json" })
	List<Ticket> findTickets() {
		return ticketService.getAll();
	}

	@RequestMapping(method = RequestMethod.POST, consumes = { "application/json" })
	Ticket saveTicket(@RequestBody Ticket ticket) {
		return ticketService.create(ticket);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = { "application/json" })
	Ticket updateTicket(@RequestBody Ticket ticket) {
		return ticketService.update(ticket);
	}

	@RequestMapping(value = "ticket", method = RequestMethod.GET, produces = { "application/json" })
	Ticket findTicketByPaymentId(@RequestParam("paymentId") String paymentId) {
		return ticketService.findByPaymentId(paymentId);
	}

}
