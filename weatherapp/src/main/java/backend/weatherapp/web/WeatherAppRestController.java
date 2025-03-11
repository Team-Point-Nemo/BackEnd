package backend.weatherapp.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherAppRestController {

    @Value("${weather.api.key}")
    private String apiKey;

    @GetMapping("/weather")
    public ResponseEntity<Map<String, Object>> getWeather() {
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=Helsinki&units=metric&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> response = restTemplate.getForObject(apiUrl, Map.class);

        if (response == null) {
            return ResponseEntity.badRequest().build();
        }

        Map<String, Object> main = (Map<String, Object>) response.get("main");
        Map<String, Object> weather = ((Map<String, Object>[]) response.get("weather"))[0];

        Map<String, Object> simplifiedResponse = new HashMap<>();
        simplifiedResponse.put("city", response.get("name"));
        simplifiedResponse.put("temperature", main.get("temp"));
        simplifiedResponse.put("description", weather.get("description"));
        simplifiedResponse.put("icon", weather.get("icon"));

        return ResponseEntity.ok(simplifiedResponse);
    }

}
