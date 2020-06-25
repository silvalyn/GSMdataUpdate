package com.example.gsmdata;

public class ReadData {
    private String Humidity;
    private String Temperature;
    private String Location;
    private String Location2;
    private String GabegeLevel;

    public ReadData(){


}

    public ReadData(String humidity, String temperature, String location, String location2, String gabegeLevel) {
        Humidity = humidity;
        Temperature = temperature;
        Location = location;
        Location = location2;
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

    public void setLocation(String location2) {
        Location = location2;
    }
    public String getLocation2() {
        return Location2;
    }

    public void setLocation2(String location2) {
        Location2 = location2;
    }

    public String getGabegeLEvel() {
        return GabegeLevel;
    }

    public void setGabegeLEvel(String gabegeLEvel) {
        GabegeLevel = gabegeLEvel;
    }
}
