package tudor.ryan.domain.gas.services;

import tudor.ryan.domain.gas.models.Gas;

import java.util.List;
import java.util.Optional;

public interface GasService {
    Optional<List<Gas>> requestDataFromApi();
}
