package com.prashant.CovidTracker19.Services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.stereotype.Service;

import com.prashant.CovidTracker19.Models.CovidWorldWideCountryData;
import com.prashant.CovidTracker19.Models.CovidWorldWideData;
import com.prashant.CovidTracker19.Util.ApplicationProperties;

@Service
public class CovidWorldWideDetailsService {

	@Autowired
	ApplicationProperties applicationProperties;

	public CovidWorldWideData getAllWorldWideData() {

		CovidWorldWideData covidWorldWideDataObj = new CovidWorldWideData();
		List<CovidWorldWideCountryData> listOfCountryData = new ArrayList<CovidWorldWideCountryData>();
		CovidWorldWideCountryData covidWorldWideCountryDataObj = null;

		try {

			String COVID_DATA_URL = applicationProperties.getCovidDataUrl();

			HttpClient httpClient = HttpClient.newHttpClient();
			HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(COVID_DATA_URL)).build();
			HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

			// System.out.println(httpResponse.body());

			JSONObject jO = new JSONObject(httpResponse.body());
			JSONObject countryJo = jO.getJSONObject("Global");
			covidWorldWideDataObj.setDate(countryJo.getString("Date"));
			covidWorldWideDataObj.setNewConfirmed(countryJo.get("NewConfirmed").toString());
			covidWorldWideDataObj.setNewDeaths(countryJo.get("NewDeaths").toString());
			covidWorldWideDataObj.setTotalConfirmed(countryJo.get("TotalConfirmed").toString());
			covidWorldWideDataObj.setTotalDeaths(countryJo.get("TotalDeaths").toString());

			JSONArray jA = jO.getJSONArray("Countries");

			for (int i = 0; i < jA.length(); i++) {
				JSONObject jObj = jA.getJSONObject(i);

				covidWorldWideCountryDataObj = new CovidWorldWideCountryData();

				covidWorldWideCountryDataObj.setCountry(jObj.getString("Country"));
				covidWorldWideCountryDataObj.setCountryCode(jObj.getString("CountryCode"));
				covidWorldWideCountryDataObj.setCountryDate(jObj.getString("Date"));
				covidWorldWideCountryDataObj.setCountryTotalConfirmed(jObj.get("TotalConfirmed").toString());
				covidWorldWideCountryDataObj.setCountryTotalDeaths(jObj.get("TotalDeaths").toString());

				listOfCountryData.add(covidWorldWideCountryDataObj);
			}

			covidWorldWideDataObj.setCovidWorldWideCountryData(listOfCountryData);
		} catch (Exception e) {

		}

		return covidWorldWideDataObj;
	}
}
