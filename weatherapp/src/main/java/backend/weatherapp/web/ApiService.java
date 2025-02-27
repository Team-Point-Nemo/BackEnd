package backend.weatherapp.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
    @Value("${external.api.key}")
    private String apiKey;

    public String fetchData() {
        String url = "https://external-api.com/data?key=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}
