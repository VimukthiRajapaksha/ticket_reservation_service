package edu.sliit.ds.assignment2.train_rest_api.service;

import java.util.List;


import edu.sliit.ds.assignment2.train_rest_api.model.Train;


public interface TrainService {
	public Train create(Train train);

	public List<Train> getAll();

	public Train findByType(String type);

	public Train findById(String trainId);

	public Train findByNumber(String number);

	public Train update(Train train);
}
