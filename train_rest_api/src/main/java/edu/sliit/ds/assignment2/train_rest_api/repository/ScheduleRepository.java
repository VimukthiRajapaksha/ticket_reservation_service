package edu.sliit.ds.assignment2.train_rest_api.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.sliit.ds.assignment2.train_rest_api.model.Schedule;


@Repository
public interface ScheduleRepository extends MongoRepository<Schedule, String>{
	//public Schedule findSchedulesByDayNFromNTo(String day,String time, String from, String to);
}
