package com.prashant.CovidTracker19.Controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaccineTrackerController {

	@GetMapping(path = "/covidtracker/vaccine", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getCovidDetails() throws IOException, InterruptedException {

		String COVID_DATA_URL = "https://api.covid19api.com/summary";

		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(COVID_DATA_URL)).build();
		HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

		return new ResponseEntity<Object>(httpResponse.body(), HttpStatus.OK);
	}

}
