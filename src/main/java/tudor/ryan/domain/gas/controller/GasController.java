package tudor.ryan.domain.gas.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tudor.ryan.domain.gas.models.Gas;
import tudor.ryan.domain.gas.services.GasService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("gas")
@Slf4j
@CrossOrigin("http://localhost:3000")
public class GasController {

    private GasService gasService;

    @Autowired
    public GasController(GasService gasService){
        this.gasService = gasService;
    }

    @GetMapping("")
    public ResponseEntity<List<Gas>> requestAllGasPrices(){
        Optional<List<Gas>> optionalGasList = gasService.requestDataFromApi();
        List<Gas> gasList = optionalGasList.get();
        return new ResponseEntity<>(gasList, HttpStatus.OK);
    }
}
