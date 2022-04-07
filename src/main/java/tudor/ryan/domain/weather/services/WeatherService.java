package tudor.ryan.domain.weather.services;

import tudor.ryan.domain.weather.models.WeatherAPIResponse;

import java.util.Optional;

public interface WeatherService {
    Optional<WeatherAPIResponse> requestDataFromApi(String lat, String lon);
}
