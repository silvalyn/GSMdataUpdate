package com.example.gsmdata;

public class ReadData {
    private String Humidity;
    private String Temperature;
    private String Location;
    private String GabegeLevel;

    public ReadData(){


}

    public ReadData(String humidity, String temperature, String location, String gabegeLevel) {
        Humidity = humidity;
        Temperature = temperature;
        Location = location;
        GabegeLevel = gabegeLevel;
    }

    public String getHumidity() {
        return Humidity;
    }

    public void setHumidity(String humidity) {
        Humidity = humidity;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getGabegeLEvel() {
        return GabegeLevel;
    }

    public void setGabegeLEvel(String gabegeLEvel) {
        GabegeLevel = gabegeLEvel;
    }
}
