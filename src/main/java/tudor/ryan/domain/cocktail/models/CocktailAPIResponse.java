package tudor.ryan.domain.cocktail.models;

import java.util.List;

public class CocktailAPIResponse {
    private Drinks result;

    public CocktailAPIResponse() {
    }

    public Drinks getResult() {
        return result;
    }

    public void setResult(Drinks result) {
        this.result = result;
    }
}
