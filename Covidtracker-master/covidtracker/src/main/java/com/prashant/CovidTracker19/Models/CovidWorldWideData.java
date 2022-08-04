package com.prashant.CovidTracker19.Models;

import java.util.List;

public class CovidWorldWideData {

	private String NewConfirmed;
	private String TotalConfirmed;
	private String NewDeaths;
	private String TotalDeaths;
	private String Date;

	private List<CovidWorldWideCountryData> covidWorldWideCountryData;

	public String getNewConfirmed() {
		return NewConfirmed;
	}

	public void setNewConfirmed(String newConfirmed) {
		NewConfirmed = newConfirmed;
	}

	public String getTotalConfirmed() {
		return TotalConfirmed;
	}

	public void setTotalConfirmed(String totalConfirmed) {
		TotalConfirmed = totalConfirmed;
	}

	public String getNewDeaths() {
		return NewDeaths;
	}

	public void setNewDeaths(String newDeaths) {
		NewDeaths = newDeaths;
	}

	public String getTotalDeaths() {
		return TotalDeaths;
	}

	public void setTotalDeaths(String totalDeaths) {
		TotalDeaths = totalDeaths;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public List<CovidWorldWideCountryData> getCovidWorldWideCountryData() {
		return covidWorldWideCountryData;
	}

	public void setCovidWorldWideCountryData(List<CovidWorldWideCountryData> covidWorldWideCountryData) {
		this.covidWorldWideCountryData = covidWorldWideCountryData;
	}

	@Override
	public String toString() {
		return "CovidWorldWideData [NewConfirmed=" + NewConfirmed + ", TotalConfirmed=" + TotalConfirmed
				+ ", NewDeaths=" + NewDeaths + ", TotalDeaths=" + TotalDeaths + ", Date=" + Date
				+ ", covidWorldWideCountryData=" + covidWorldWideCountryData + "]";
	}

}
