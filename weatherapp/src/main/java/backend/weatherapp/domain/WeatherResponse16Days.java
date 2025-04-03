package backend.weatherapp.domain;

import java.util.List;


//todo: add attributes, getters setters etc for forecast 16 and 

//ota dt, tempDay, feels_like: day, wind, weather: icon
public class WeatherResponse16Days {

    private City city; 
    private List<WeatherData> list; 
    private Double speed;

    
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
        private Long dt;
        private List<Weather> weather;  
        private FeelsLike feels_like;
        private Temperature temp;
       
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
        private Double day;

        public Double getDay() {
            return day;
        }

        public void setDay(Double day) {
            this.day = day;
        }       
    }

    public static class Temperature {
        private Double day;
        private Double night;
        private Double max;
        private Double min;

        public Double getDay() {
            return day;
        }
        public void setDay(Double day) {
            this.day = day;
        }
        public Double getNight() {
            return night;
        }
        public void setNight(Double night) {
            this.night = night;
        }
        public Double getMax() {
            return max;
        }
        public void setMax(Double max) {
            this.max = max;
        }
        public Double getMin() {
            return min;
        }
        public void setMin(Double min) {
            this.min = min;
        }
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    
}
