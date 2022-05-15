package tudor.ryan.domain.cocktail.models;

import java.util.List;

public class Drinks {
    private List<Drink> drinks;

    public Drinks() {
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }
}
