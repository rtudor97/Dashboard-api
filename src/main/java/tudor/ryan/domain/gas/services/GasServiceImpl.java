package tudor.ryan.domain.gas.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import tudor.ryan.domain.gas.models.Gas;
import tudor.ryan.domain.gas.models.GasAPIResponse;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GasServiceImpl implements GasService {

    private RestTemplate restTemplate;

    @Value("${gas.api.key}")
    private String apiKey;

    public GasServiceImpl(){
        restTemplate = new RestTemplate();
    }


    @Override
    public Optional<List<Gas>> requestDataFromApi() {
        try{
            String url = "https://gas-price.p.rapidapi.com/allUsaPrice";
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-RapidAPI-Host","gas-price.p.rapidapi.com");
            headers.set("X-RapidAPI-Key",apiKey);
            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<GasAPIResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, GasAPIResponse.class);
            GasAPIResponse apiResponse = response.getBody();
            return Optional.of(apiResponse.getResult());
        }catch(HttpClientErrorException ex){
            log.error(ex.getMessage());
            return Optional.empty();
        }
    }
}
