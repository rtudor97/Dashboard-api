package tudor.ryan.domain.gas.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import tudor.ryan.domain.gas.models.GasAPIResponse;

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
    public Optional<GasAPIResponse> requestDataFromApi() {
        try{
            String url = "https://gas-price.p.rapidapi.com/allUsaPrice";
            String requestUrl = String.format(url,apiKey);
            ResponseEntity<GasAPIResponse> response = restTemplate.exchange(requestUrl, HttpMethod.GET, null,GasAPIResponse.class);
            GasAPIResponse apiResponse = response.getBody();
            return Optional.of(apiResponse);
        }catch(HttpClientErrorException ex){
            log.error(ex.getMessage());
            return Optional.empty();
        }
    }
}
