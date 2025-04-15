package backend.weatherapp.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import backend.weatherapp.domain.WeatherCityResponse;
import backend.weatherapp.domain.WeatherNowResponse;
import backend.weatherapp.domain.WeatherResponse16Days;
import backend.weatherapp.domain.WeatherResponseFiveDays;

@RestController
public class WeatherAppRestController {

    @Value("${weather.api.key}")
    private String apiKey;
 
    @GetMapping("/weather-now")
    public ResponseEntity<WeatherNowResponse> getWeatherInCurrentLocation(@RequestParam double lat,
            @RequestParam double lon) {

        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid="
                + apiKey + "&units=metric";

        RestTemplate restTemplate = new RestTemplate();
        WeatherNowResponse response = restTemplate.getForObject(apiUrl, WeatherNowResponse.class);

        if (response == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping("/city")
    public ResponseEntity<WeatherCityResponse> getCityWeather(@RequestParam String city) {

        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" 
                + apiKey + "&units=metric";

        RestTemplate restTemplate = new RestTemplate();
        WeatherCityResponse response = restTemplate.getForObject(apiUrl, WeatherCityResponse.class);

        if (response == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(response);
    }


    @GetMapping("/forecast5")
    public ResponseEntity<WeatherResponseFiveDays> getWeatherForecast5(@RequestParam double lat,
            @RequestParam double lon) {

        String apiUrl = "https://api.openweathermap.org/data/2.5/forecast?lat=" + lat + "&lon=" + lon + "&appid="
                + apiKey + "&units=metric";

        RestTemplate restTemplate = new RestTemplate();
        WeatherResponseFiveDays response = restTemplate.getForObject(apiUrl, WeatherResponseFiveDays.class);

        if (response == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(response);
    }


    @GetMapping("/forecast16")
    public ResponseEntity<WeatherResponse16Days> getWeatherForecast16(@RequestParam double lat,
            @RequestParam double lon) {

        String apiUrl = "https://api.openweathermap.org/data/2.5/forecast/daily?lat=" + lat + "&lon=" + lon
                + "&cnt=16&appid=" + apiKey + "&units=metric";

        RestTemplate restTemplate = new RestTemplate();
        WeatherResponse16Days response = restTemplate.getForObject(apiUrl, WeatherResponse16Days.class);

        if (response == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(response);
    }

}