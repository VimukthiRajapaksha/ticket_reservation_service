package edu.sliit.ds.assignment2.train_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.sliit.ds.assignment2.train_rest_api.model.Train;
import edu.sliit.ds.assignment2.train_rest_api.service.TrainService;


@RestController
@RequestMapping("trains")
public class TrainController {
	
	@Autowired
	@Qualifier("trainServiceImpl")
	TrainService trainService;
	
	
	@RequestMapping(method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	List<Train> findTrains() {
		return trainService.getAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes= {"application/json"})
	Train saveTrain(@RequestBody Train train) {
		return trainService.create(train);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes= {"application/json"})
	Train updateTrain(@RequestBody Train train) {
		return trainService.update(train);
	}
	
	@RequestMapping(value= "/{type}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	Train findTrainByType(@RequestParam("type")String type) {
		return trainService.findByType(type);
	}
	
	@RequestMapping(value= "/{trainId}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	Train findTrainById(@RequestParam("trainId")String trainId) {
		return trainService.findById(trainId);
	}
	
	@RequestMapping(value= "/{number}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	Train findTrainByNumber(@RequestParam("number")String number) {
		return trainService.findByNumber(number);
	}
}
