package com.example.adapterviewexam;

public class Weather {
    private String city;
    private String temp;
    private String weather;

    public Weather(String city, String temp, String weather){
        this.city = city;
        this.temp = temp;
        this.weather = weather;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = this.city;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Weather{");
        sb.append("city='").append(city).append('\'');
        sb.append(", temp='").append(temp).append('\'');
        sb.append(", weather='").append(weather).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
