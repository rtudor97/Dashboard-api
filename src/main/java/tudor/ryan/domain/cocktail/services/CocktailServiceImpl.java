package tudor.ryan.domain.cocktail.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import tudor.ryan.domain.cocktail.models.CocktailAPIResponse;
import tudor.ryan.domain.cocktail.models.Drinks;

import java.util.Optional;

@Service
@Slf4j
public class CocktailServiceImpl implements CocktailService{

    private RestTemplate restTemplate;

    @Value("${drink.api.key}")
    private String apiKey;

    public CocktailServiceImpl(){
        restTemplate = new RestTemplate();
    }

    @Override
    public Optional<Drinks> requestDataFromApi() {
        try{
            String url = "https://the-cocktail-db.p.rapidapi.com/filter.php";
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-RapidAPI-Host","the-cocktail-db.p.rapidapi.com");
            headers.set("X-RapidAPI-Key",apiKey);
            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<CocktailAPIResponse> response = restTemplate.exchange(url, HttpMethod.GET,entity,CocktailAPIResponse.class);
            CocktailAPIResponse apiResponse = response.getBody();
            return Optional.of(apiResponse.getResult());
        }catch(HttpClientErrorException ex){
            log.error(ex.getMessage());
            return Optional.empty();
        }
    }
}
