package backend.weatherapp.domain;

import java.util.List;

import backend.weatherapp.domain.WeatherResponse.MainWeather;
import backend.weatherapp.domain.WeatherResponse.Wind;

public class WeatherResponseFiveDays {

    private City city;  
    private List<Weather> list;  

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Weather> getList() {
        return list;
    }

    public void setList(List<Weather> list) {
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


    public static class Weather {
        private MainWeather main;
        private Wind wind;
        private Long dt;
        private String dt_txt;
        private String icon;


        public MainWeather getMain() {
            return main;
        }

        public void setMain(MainWeather main) {
            this.main = main;
        }

        public Wind getWind() {
            return wind;
        }

        public void setWind(Wind wind) {
            this.wind = wind;
        }

        public Long getDt() {
            return dt;
        }

        public void setDt(Long dt) {
            this.dt = dt;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}