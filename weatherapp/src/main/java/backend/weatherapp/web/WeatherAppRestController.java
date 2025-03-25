package backend.weatherapp.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import backend.weatherapp.domain.WeatherResponse;
import backend.weatherapp.domain.WeatherResponse.MainWeather;
import backend.weatherapp.domain.WeatherResponse.Weather;

@RestController
public class WeatherAppRestController {

    @Value("${weather.api.key}")
    private String apiKey;

    @GetMapping("/weather")
    public ResponseEntity<Map<String, Object>> getWeather() {
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=Helsinki&units=metric&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();

        WeatherResponse response = restTemplate.getForObject(apiUrl, WeatherResponse.class);

        if (response == null) {
            return ResponseEntity.badRequest().build();
        }

        MainWeather main = response.getMain();
        Weather weather = response.getWeather().get(0);

        Map<String, Object> simplifiedResponse = new HashMap<>();
        simplifiedResponse.put("city", response.getName());
        simplifiedResponse.put("temperature", main.getTemp());
        simplifiedResponse.put("description", weather.getDescription());
        simplifiedResponse.put("icon", weather.getIcon());

        return ResponseEntity.ok(simplifiedResponse);
    }

}
