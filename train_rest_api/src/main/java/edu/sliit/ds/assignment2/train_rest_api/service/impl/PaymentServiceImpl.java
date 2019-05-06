package edu.sliit.ds.assignment2.train_rest_api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.sliit.ds.assignment2.train_rest_api.model.Payment;
import edu.sliit.ds.assignment2.train_rest_api.repository.PaymentRepository;
import edu.sliit.ds.assignment2.train_rest_api.service.PaymentService;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Payment create(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Override
	public List<Payment> getAll() {
		return paymentRepository.findAll();
	}

	@Override
	public List<Payment> findByCardNumberAndDate(String cardNumber, String date) {
		return paymentRepository.findPaymentByCardNumberAndDate(cardNumber, date);
	}

	@Override
	public Payment update(Payment payment) {
		return paymentRepository.save(payment);
	}
	

}
