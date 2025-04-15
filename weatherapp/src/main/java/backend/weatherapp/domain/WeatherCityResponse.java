package backend.weatherapp.domain;

import java.util.List;

public class WeatherCityResponse {

    private Coord coord;
    private Wind wind;
    private MainWeather main;
    private List<Weather> weather;
    private String name;

    
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

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public static class Coord{
        private Double lon;
        private Double lat;
        public Double getLon() {
            return lon;
        }
        public void setLon(Double lon) {
            this.lon = lon;
        }
        public Double getLat() {
            return lat;
        }
        public void setLat(Double lat) {
            this.lat = lat;
        }

       
        
    }

}
