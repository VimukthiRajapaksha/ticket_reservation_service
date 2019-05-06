package edu.sliit.ds.assignment2.train_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.sliit.ds.assignment2.train_rest_api.model.Schedule;
import edu.sliit.ds.assignment2.train_rest_api.service.ScheduleService;


@RestController
@RequestMapping("/schedules")
public class ScheduleController {
	 
	@Autowired
	@Qualifier("scheduleServiceImpl")
	private ScheduleService scheduleService;
	
	@RequestMapping(method = RequestMethod.GET, produces= {"application/json"})
	List<Schedule> findSchedules() {
		return scheduleService.getAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes= {"application/json"})
	Schedule saveSchedules(@RequestBody Schedule schedule) {
		return scheduleService.create(schedule);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes= {"application/json"})
	Schedule updateSchedules(@RequestBody Schedule schedule) {
		return scheduleService.update(schedule);
	}
	
	@RequestMapping(value= "/schedule", method = RequestMethod.GET, produces= {"application/json"})
	Schedule findSchedulesByDayAndTimeAndFromAndTo(@RequestParam("day")String day,@RequestParam("time")String time,@RequestParam("from")String from,@RequestParam("to")String to) {
		return scheduleService.findByDayAndTimeAndFromAndTo(day, time, from, to);
	}
	
	

}
