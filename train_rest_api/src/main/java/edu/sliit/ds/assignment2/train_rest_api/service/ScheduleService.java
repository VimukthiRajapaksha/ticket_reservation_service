package edu.sliit.ds.assignment2.train_rest_api.service;

import java.util.List;


import edu.sliit.ds.assignment2.train_rest_api.model.Schedule;


public interface ScheduleService {
	
	public Schedule create(Schedule schedule);

	public List<Schedule> getAll();

	public Schedule findByDayAndTimeAndFromAndTo(String day, String time, String from, String to);

	public Schedule update(Schedule schedule);
}
