package edu.sliit.ds.assignment2.train_rest_api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.sliit.ds.assignment2.train_rest_api.model.Payment;


@Repository
public interface PaymentRepository extends MongoRepository<Payment, String>{
	public List<Payment> findPaymentByCardNumberAndDate(String cardNumber, String date);
	public Payment findByPayId(String payId);
}
