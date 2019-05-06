package edu.sliit.ds.assignment2.train_rest_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.sliit.ds.assignment2.train_rest_api.model.Train;

@Repository
public interface TrainRepository extends MongoRepository<Train, String>{
	public Train findTrainByType(String type);
	public Train findTrainById(String trainId);
	public Train findTrainByNumber(String number);

}
