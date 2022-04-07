package tudor.ryan.domain.weather.controllers;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tudor.ryan.domain.weather.models.WeatherAPIResponse;
import tudor.ryan.domain.weather.services.WeatherService;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/weather")
@Slf4j
public class WeatherController {

    private WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @GetMapping("")
    public ResponseEntity<WeatherAPIResponse> requestWeather(@RequestParam(name = "lon",required = false) String lon, @RequestParam(name = "lat",required = false) String lat){
        Optional<WeatherAPIResponse> response = weatherService.requestDataFromApi(lat,lon);
        log.info(response.get().toString());
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
