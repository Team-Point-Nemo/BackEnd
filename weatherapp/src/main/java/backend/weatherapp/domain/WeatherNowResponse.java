package backend.weatherapp.domain;

import java.util.List;

public class WeatherNowResponse {

    private Wind wind;
    private MainWeather main;
    private List<Weather> weather;

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public MainWeather getMain() {
        return main;
    }

    public void setMain(MainWeather main) {
        this.main = main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public static class MainWeather {
        private Double temp;
        private Double feels_like;

        public Double getTemp() {
            return temp;
        }
        public void setTemp(Double temp) {
            this.temp = temp;
        }
        public Double getFeels_like() {
            return feels_like;
        }
        public void setFeels_like(Double feels_like) {
            this.feels_like = feels_like;
        }
    }

    public static class Weather {
        private String icon;
        private String description;
        private String main;
        
        public String getIcon() {
            return icon;
        }
        public void setIcon(String icon) {
            this.icon = icon;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public String getMain() {
            return main;
        }
        public void setMain(String main) {
            this.main = main;
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
