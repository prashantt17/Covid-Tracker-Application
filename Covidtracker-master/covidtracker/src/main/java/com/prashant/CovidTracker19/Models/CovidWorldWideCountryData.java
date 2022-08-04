package com.prashant.CovidTracker19.Models;

public class CovidWorldWideCountryData {

	private String Country;
	private String CountryCode;
	private String CountryTotalConfirmed;
	private String CountryTotalDeaths;
	private String CountryDate;

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}

	public String getCountryTotalConfirmed() {
		return CountryTotalConfirmed;
	}

	public void setCountryTotalConfirmed(String countryTotalConfirmed) {
		CountryTotalConfirmed = countryTotalConfirmed;
	}

	public String getCountryTotalDeaths() {
		return CountryTotalDeaths;
	}

	public void setCountryTotalDeaths(String countryTotalDeaths) {
		CountryTotalDeaths = countryTotalDeaths;
	}

	public String getCountryDate() {
		return CountryDate;
	}

	public void setCountryDate(String countryDate) {
		CountryDate = countryDate;
	}

	@Override
	public String toString() {
		return "CovidWorldWideCountryData [Country=" + Country + ", CountryCode=" + CountryCode
				+ ", CountryTotalConfirmed=" + CountryTotalConfirmed + ", CountryTotalDeaths=" + CountryTotalDeaths
				+ ", CountryDate=" + CountryDate + "]";
	}

}
