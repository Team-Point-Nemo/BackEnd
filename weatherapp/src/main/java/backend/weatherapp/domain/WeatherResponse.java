package backend.weatherapp.domain;

import java.util.List;

public class WeatherResponse {

    private MainWeather main;
    private List<Weather> weather;
    private String name;
    private Double temperature;
    private String description;
    private String icon;

    public WeatherResponse() {
    }

    public WeatherResponse(String city, Double temperature, String description, String icon) {
        this.name = city;
        this.temperature = temperature;
        this.description = description;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public Double getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public void setName(String city) {
        this.name = city;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public MainWeather getMain() {
        return main;
    }

    public void setMain(MainWeather main) {
        this.main = main;
    }

    public static class MainWeather {
        private Double temp;

        public Double getTemp() {
            return temp;
        }

        public void setTemp(Double temp) {
            this.temp = temp;
        }
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public static class Weather {
        private String description;
        private String icon;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }




}