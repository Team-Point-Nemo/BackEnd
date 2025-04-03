package backend.weatherapp.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import backend.weatherapp.domain.WeatherResponse;
import backend.weatherapp.domain.WeatherResponse16Days;
import backend.weatherapp.domain.WeatherResponse.MainWeather;
import backend.weatherapp.domain.WeatherResponse.Weather;
import backend.weatherapp.domain.WeatherResponse.Wind;
import backend.weatherapp.domain.WeatherResponseFiveDays;


@RestController
public class WeatherAppRestController {

    @Value("${weather.api.key}")
    private String apiKey;

    @GetMapping("/weather")
    public ResponseEntity<Map<String, Object>> getWeather () {
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=Helsinki&units=metric&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();

        WeatherResponse response = restTemplate.getForObject(apiUrl, WeatherResponse.class);

        if (response == null) {
            return ResponseEntity.badRequest().build();
        }

        //from api json
        MainWeather main = response.getMain();
        Weather weather = response.getWeather().get(0);
        Wind wind = response.getWind();
        Long dt = response.getDt();
        String dt_txt = response.getDt_txt();

        Map<String, Object> simplifiedResponse = new HashMap<>();
        simplifiedResponse.put("city", response.getName());
        simplifiedResponse.put("temperature", main.getTemp());
        simplifiedResponse.put("feels_like", main.getFeels_like());
        simplifiedResponse.put("icon", weather.getIcon());
        simplifiedResponse.put("wind_speed", wind.getSpeed());
        simplifiedResponse.put("timestamp", dt);
        simplifiedResponse.put("dt_txt", dt_txt);


        return ResponseEntity.ok(simplifiedResponse);
    }

    @GetMapping("/forecast5")
    public  ResponseEntity<WeatherResponseFiveDays> getWeatherForecast5(@RequestParam double lat, @RequestParam double lon) {

        String apiUrl = "https://api.openweathermap.org/data/2.5/forecast?lat=" + lat +"&lon=" + lon + "&appid=" + apiKey+ "&units=metric";

        RestTemplate restTemplate = new RestTemplate();

        WeatherResponseFiveDays response = restTemplate.getForObject(apiUrl, WeatherResponseFiveDays.class);

        if (response == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/forecast16")
    public  ResponseEntity<WeatherResponse16Days> getWeatherForecast16() {

        String apiUrl = "https://api.openweathermap.org/data/2.5/forecast?lat=44.34&lon=10.99&cnt=16&appid=" + apiKey+ "&units=metric";

        RestTemplate restTemplate = new RestTemplate();

        WeatherResponse16Days response = restTemplate.getForObject(apiUrl, WeatherResponse16Days.class);

        if (response == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(response);
    }
}
