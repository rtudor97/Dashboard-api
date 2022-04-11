package tudor.ryan.domain.gas.services;

import tudor.ryan.domain.gas.models.GasAPIResponse;

import java.util.Optional;

public interface GasService {
    Optional<GasAPIResponse> requestDataFromApi();
}
