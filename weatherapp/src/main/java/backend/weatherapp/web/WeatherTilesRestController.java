package backend.weatherapp.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/tiles")
public class WeatherTilesRestController {

    @Value("${weather.api.key}")
    private String apiKey;

    @GetMapping("/{layer}/{z}/{x}/{y}.png")
    public ResponseEntity<byte[]> proxyWeatherTile(
            @PathVariable String layer,
            @PathVariable String z,
            @PathVariable String x,
            @PathVariable String y) {

        String url = String.format(
                "https://tile.openweathermap.org/map/%s/%s/%s/%s.png?appid=%s",
                layer, z, x, y, apiKey);

        RestTemplate restTemplate = new RestTemplate();

        try {
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.IMAGE_PNG)
                    .body(restTemplate.getForObject(url, byte[].class));
        } catch (Exception e) {
            return ResponseEntity.status(502).build();
        }
    }

}
