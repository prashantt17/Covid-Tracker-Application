package com.prashant.CovidTracker19.Models;

public class LiveCountryData {

	private String Country;
	private String CountryCode;
	private String Province;
	private int Active;

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

	public String getProvince() {
		return Province;
	}

	public void setProvince(String province) {
		Province = province;
	}

	public int getActive() {
		return Active;
	}

	public void setActive(int active) {
		Active = active;
	}

	@Override
	public String toString() {
		return "LiveCountryData [Country=" + Country + ", CountryCode=" + CountryCode + ", Province=" + Province
				+ ", Active=" + Active + "]";
	}

}
