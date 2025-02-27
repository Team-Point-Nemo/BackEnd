package backend.weatherapp.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherAppRestController {

    @Value("${weather.api.key}")
    private String apiKey;

    @GetMapping("/index")
    public String home() {
        return apiKey;
    }

}
