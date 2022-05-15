package tudor.ryan.domain.cocktail.services;

import tudor.ryan.domain.cocktail.models.Drink;
import tudor.ryan.domain.cocktail.models.Drinks;

import java.util.List;
import java.util.Optional;

public interface CocktailService {
    Optional<Drinks> requestDataFromApi();
}
