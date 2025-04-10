package backend.weatherapp.domain;

import java.util.List;

public class WeatherResponse {

    private MainWeather main;
    private List<Weather> weather;
    private String name;
    private Wind wind;
    private Long dt;
    private String dt_txt;
    private Double temperature;
    private String description;
    private String icon;

    public WeatherResponse() {
    }

    public WeatherResponse(MainWeather main, String name, Wind wind, Long dt, String dt_txt,
    Double temperature, String description, String icon) {
        this.main = main;
        this.name = name;
        this.wind = wind;
        this.dt = dt;
        this.dt_txt = dt_txt;
        this.temperature = temperature;
        this.description = description;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public Long getDt() {
        return dt;
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
    public Wind getWind() {
        return wind;
    }
    
    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
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
        private Double feels_like;

        public Double getFeels_like() {
            return feels_like;
        }

        public void setFeels_like(Double feels_like) {
            this.feels_like = feels_like;
        }

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
        private String icon;

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class Wind {
        private Double speed;

        public Double getSpeed() {
            return speed;
        }

        public void setSpeed(Double speed) {
            this.speed = speed;
        }
    }


}