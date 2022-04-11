package tudor.ryan.domain.gas.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class GasServiceImpl implements GasService {

    @Override
    public Optional<String> requestDataFromApi() {
        return Optional.empty();
    }
}
