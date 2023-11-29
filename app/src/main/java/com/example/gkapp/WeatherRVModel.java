package com.example.gkapp;

public class WeatherRVModel {

    private String time;
    private String temperature;
    private String windSpeed;
    private String icon;

    public WeatherRVModel(String time, String temperature, String windSpeed, String icon) {
        this.time = time;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.icon = icon;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
