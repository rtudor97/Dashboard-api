package tudor.ryan.domain.cocktail.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tudor.ryan.domain.cocktail.models.Drinks;
import tudor.ryan.domain.cocktail.services.CocktailService;


import java.util.Optional;

@RestController
@RequestMapping("drinks")
@CrossOrigin("http://localhost:3000")
@Slf4j
public class CocktailController {
    private CocktailService cocktailService;

    @Autowired
    public CocktailController(CocktailService cocktailService){
        this.cocktailService = cocktailService;
    }

    @GetMapping("")
    public ResponseEntity<Drinks> requestAllDrinks(){
        Optional<Drinks> optionalDrinkList = cocktailService.requestDataFromApi();
        Drinks drinks = optionalDrinkList.get();
        return new ResponseEntity<>(drinks, HttpStatus.OK);
    }
}
