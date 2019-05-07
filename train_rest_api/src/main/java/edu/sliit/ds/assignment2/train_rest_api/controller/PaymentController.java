package edu.sliit.ds.assignment2.train_rest_api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.sliit.ds.assignment2.train_rest_api.model.Payment;
import edu.sliit.ds.assignment2.train_rest_api.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping(value = "/payments", method = RequestMethod.GET)
	List<Payment> findPayments() {
		List<Payment> list = new ArrayList<>();
		Payment p = new Payment();
		p.setAmount(1000);
		p.setCardHolderName("Ruwan");
		list.add(p);

		return list;/* paymentService.getAll(); */
	}

	@RequestMapping(value = "/payments", method = RequestMethod.POST)
	Payment savePayment(@RequestBody Payment payment) {
		return paymentService.create(payment);
	}

	@RequestMapping(value = "/payments", method = RequestMethod.PUT)
	Payment updatePayment(@RequestBody Payment payment) {
		return paymentService.update(payment);
	}

	@RequestMapping(value = "/payments/{cardNumber}/{date}", method = RequestMethod.GET)
	List<Payment> findPaymentByCardNUmberNDate(@PathVariable String cardNumber, @PathVariable String date) {
		return paymentService.findByCardNumberAndDate(cardNumber, date);
	}
}
