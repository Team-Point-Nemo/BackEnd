package backend.weatherapp.domain;

import java.util.List;

import backend.weatherapp.domain.WeatherResponseFiveDays.City;

//todo: add attributes, getters setters etc for forecast 16 and 

//ota dt, tempDay, feels_like: day, wind, weather: icon
public class WeatherResponse16Days {

    private City city; 
    private List<WeatherData> list;  

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<WeatherData> getList() {
        return list;
    }

    public void setList(List<WeatherData> list) {
        this.list = list;
    }

    public static class City {
        private String name;  

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class WeatherData {
        private String speed;
        private Long dt;
        private List<Weather> weather;  
        private FeelsLike feels_like;
        private Temperature temp;


        public FeelsLike getFeels_like() {
            return feels_like;
        }

        public void setFeels_like(FeelsLike feels_like) {
            this.feels_like = feels_like;
        }

        public Temperature getTemp() {
            return temp;
        }

        public void setTemp(Temperature temp) {
            this.temp = temp;
        }

        public Long getDt() {
            return dt;
        }

        public void setDt(Long dt) {
            this.dt = dt;
        }


        public List<Weather> getWeather() { 
            return weather;
        }

        public void setWeather(List<Weather> weather) {
            this.weather = weather;
        }

        public String getSpeed() {
            return speed;
        }

        public void setSpeed(String speed) {
            this.speed = speed;
        }
    }

    public static class Weather {
        private String icon;
        private String description; 

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
    }

    public static class FeelsLike{
        private String day;

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }       
    }

    public static class Temperature {
        private String day;
        private String night;
        private String max;
        private String min;

        public String getDay() {
            return day;
        }
        public void setDay(String day) {
            this.day = day;
        }
        public String getNight() {
            return night;
        }
        public void setNight(String night) {
            this.night = night;
        }
        public String getMax() {
            return max;
        }
        public void setMax(String max) {
            this.max = max;
        }
        public String getMin() {
            return min;
        }
        public void setMin(String min) {
            this.min = min;
        }
    }
}
