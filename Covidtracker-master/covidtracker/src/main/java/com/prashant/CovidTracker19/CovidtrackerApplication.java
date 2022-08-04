package com.prashant.CovidTracker19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidtrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidtrackerApplication.class, args);
	}

}
