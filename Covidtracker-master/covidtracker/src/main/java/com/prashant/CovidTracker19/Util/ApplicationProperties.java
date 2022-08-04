package com.prashant.CovidTracker19.Util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {

	@Value("${tracker.COVID_DATA_URL}")
	private String covidDataUrl;

	public String getCovidDataUrl() {
		return covidDataUrl;
	}

	public void setCovidDataUrl(String covidDataUrl) {
		this.covidDataUrl = covidDataUrl;
	}
	
	
}
