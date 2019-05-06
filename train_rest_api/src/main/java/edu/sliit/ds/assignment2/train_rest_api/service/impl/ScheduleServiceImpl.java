package edu.sliit.ds.assignment2.train_rest_api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.sliit.ds.assignment2.train_rest_api.model.Schedule;
import edu.sliit.ds.assignment2.train_rest_api.repository.ScheduleRepository;
import edu.sliit.ds.assignment2.train_rest_api.service.ScheduleService;

@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService{
	
	@Autowired
	private ScheduleRepository scheduleRepository;

	@Override
	public Schedule create(Schedule schedule) {
		return scheduleRepository.save(schedule);
	}

	@Override
	public List<Schedule> getAll() {
		return scheduleRepository.findAll();
	}

	@Override
	public Schedule findByDayAndTimeAndFromAndTo(String day, String time, String from, String to) {
		return scheduleRepository.findSchedulesByDayNFromNTo(day,time, from, to);
	}

	@Override
	public Schedule update(Schedule schedule) {
		Schedule sched=scheduleRepository.findSchedulesByDayNFromNTo(schedule.getDayOfTheWeek(),schedule.getTime(),schedule.getFrom(), schedule.getTo());
		sched.setDayOfTheWeek(schedule.getDayOfTheWeek());
		sched.setFrom(schedule.getFrom());
		sched.setTo(schedule.getTo());
		sched.setTime(schedule.getTime());
		sched.setTrainId(schedule.getTrainId());
		return scheduleRepository.save(sched);
	}
}
