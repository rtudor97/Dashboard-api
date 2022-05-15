package tudor.ryan;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tudor.ryan.domain.weather.models.WeatherAPIResponse;
import tudor.ryan.domain.weather.services.WeatherService;

import java.util.Optional;

@SpringBootApplication
@Slf4j
public class DashboardApiApplication{

	public static void main(String[] args) {
		SpringApplication.run(DashboardApiApplication.class, args);
	}

//	@Autowired
//	private WeatherService weatherService;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Optional<WeatherAPIResponse> response = weatherService.requestDataFromApi("39.8156","-75.5057");
//		if(response.isEmpty()){
//			log.info("No Bueno");
//			return;
//		}
//		WeatherAPIResponse data = response.get();
//		log.info(data.toString());
//	}
}
