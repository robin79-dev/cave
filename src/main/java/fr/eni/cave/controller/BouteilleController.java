package fr.eni.cave.controller;

import fr.eni.cave.entities.Bouteille;
import fr.eni.cave.repository.BouteilleRepository;
import fr.eni.cave.service.BouteilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BouteilleController {

    @Autowired
    private BouteilleService bouteilleService;

    @GetMapping("/Bouteille")
    public String toto() {
        return "riti";
    }

    @GetMapping("/Bouteille/{id}")
    public String titi() {
        return "reiygfytezfytzi";
    }

    @PostMapping("/BouteilleAjout")
    public Bouteille ajoutBouteille(@RequestBody Bouteille bouteille) {
        return bouteilleService.saveBouteille(bouteille);
    }

}
