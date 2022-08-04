package com.prashant.CovidTracker19.Models;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCase;
    private String statComparedToPrevDay;


    public String getStatComparedToPrevDay() {
        return statComparedToPrevDay;
    }

    public void setStatComparedToPrevDay(String statComparedToPrevDay) {
        this.statComparedToPrevDay = statComparedToPrevDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCase() {
        return latestTotalCase;
    }

    public void setLatestTotalCase(int latestTotalCase) {
        this.latestTotalCase = latestTotalCase;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCase=" + latestTotalCase +
                '}';
    }
}
