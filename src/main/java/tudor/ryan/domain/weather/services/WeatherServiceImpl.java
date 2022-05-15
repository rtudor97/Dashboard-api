package tudor.ryan.domain.weather.services;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import tudor.ryan.domain.weather.models.WeatherAPIResponse;

import java.util.Optional;
@Service
public class WeatherServiceImpl implements WeatherService {
    private Logger logger = LoggerFactory.getLogger(WeatherServiceImpl.class);

    private RestTemplate restTemplate;

    @Value("${weather.api.key}")
    private String apiKey;


    public WeatherServiceImpl(){
        restTemplate = new RestTemplate();
    }

    @Override
    public Optional<WeatherAPIResponse> requestDataFromApi(String lat, String lon) {
        try{
            String url = "https://api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&appid=%s&units=imperial";
            String requestUrl = String.format(url,lat,lon,apiKey);
            ResponseEntity<WeatherAPIResponse> response = restTemplate.exchange(requestUrl, HttpMethod.GET,null,WeatherAPIResponse.class);
            WeatherAPIResponse apiResponse = response.getBody();
            return Optional.of(apiResponse);
        }catch (HttpClientErrorException ex){
            logger.error(ex.getMessage());
            return Optional.empty();
        }
    }

}
