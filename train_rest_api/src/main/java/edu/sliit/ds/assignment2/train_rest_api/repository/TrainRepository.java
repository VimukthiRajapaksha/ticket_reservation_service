package edu.sliit.ds.assignment2.train_rest_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.sliit.ds.assignment2.train_rest_api.model.Train;

@Repository
public interface TrainRepository extends MongoRepository<Train, String> {
	public Train findByType(String type);

	public Train findByTrainId(String trainId);

	public Train findByNumber(String number);

}
