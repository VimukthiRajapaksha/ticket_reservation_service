package edu.sliit.ds.assignment2.train_rest_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = 	"train")
public class Train {
	
	@Id
	String trainId;
	String type;//Express,slow
	String number;//unique train number 
	
	Train() {
	}
	
	Train(String trainId,String type,String number){
		this.trainId = trainId;
		this.type = type;
		this.number = number;
	}

	public String getTrainId() {
		return trainId;
	}

	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	

}
