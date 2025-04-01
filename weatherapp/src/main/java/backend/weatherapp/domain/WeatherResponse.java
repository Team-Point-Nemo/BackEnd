package backend.weatherapp.domain;

import java.util.List;

public class WeatherResponse {

    private Main main;
    private String name;
    private List<Weather> listOfWeathers;
    private Weather weather;
    private Wind wind;
    private String dt;
    private String dtText;

    public WeatherResponse(Main main, List<Weather> listOfWeathers, Weather weather, Wind Wind, String dt, String dtText, String name) {
        this.main = main;
        this.name = name;
        this.listOfWeathers = listOfWeathers;
        this.wind = Wind;
        this.dt = dt;
        this.dtText = dtText;
    }

    public WeatherResponse() {
    }

    // MainWeather
    public static class Main {
        private Double temp;
        private Double feelsLike;

        public Double getTemp() {
            return temp;
        }

        public void setTemp(Double temp) {
            this.temp = temp;
        }

        public Double getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(Double feelsLike) {
            this.feelsLike = feelsLike;
        }
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

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getDtText() {
        return dtText;
    }

    public void setDtText(String dtText) {
        this.dtText = dtText;
    }

    // Getters and Setters
    public List<Weather> getListOfWeathers() {
        return listOfWeathers;
    }

    public void setListOfWeathers(List<Weather> listOfWeathers) {
        this.listOfWeathers = listOfWeathers;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
