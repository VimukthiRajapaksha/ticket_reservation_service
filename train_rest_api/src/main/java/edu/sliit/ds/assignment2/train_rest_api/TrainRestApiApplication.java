package edu.sliit.ds.assignment2.train_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("edu.sliit.ds.assignment2.train_rest_api")
@SpringBootApplication
public class TrainRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainRestApiApplication.class, args);
	}

}
