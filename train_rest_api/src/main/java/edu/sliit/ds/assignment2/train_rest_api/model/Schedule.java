package edu.sliit.ds.assignment2.train_rest_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = 	"schedule")
public class Schedule {
	
	@Id
	String scheduleId;
	String dayOfTheWeek;
	String time;
	String trainId;
	String from;
	String to;
	
	Schedule() {
		
	}
	
	Schedule(String scheduleId,String dayOfTheWeek,String time,String trainId,String from,String to) {
		this.scheduleId= scheduleId;
		this.dayOfTheWeek = dayOfTheWeek;
		this.time = time;
		this.trainId = trainId;
		this.from = from;
		this.to = to;
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}

	public void setDayOfTheWeek(String dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTrainId() {
		return trainId;
	}

	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	
	

}
