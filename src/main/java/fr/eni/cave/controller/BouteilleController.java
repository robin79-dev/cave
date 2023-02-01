package fr.eni.cave.controller;

import fr.eni.cave.entities.Bouteille;
import fr.eni.cave.repository.BouteilleRepository;
import fr.eni.cave.service.BouteilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BouteilleController {

    @Autowired
    private BouteilleService bouteilleService;

    @GetMapping("/Bouteille")
    public List<Bouteille> allBouteille() {
        return bouteilleService.allBouteille();
    }

    @GetMapping("/Bouteille/{id}")
    public Optional<Bouteille> bouteilleById(@PathVariable Integer id) {
        return bouteilleService.getBouteilleById(id);
    }

    @PostMapping("/BouteilleAjout")
    public Bouteille ajoutBouteille(@RequestBody Bouteille bouteille) {
        return bouteilleService.saveBouteille(bouteille);
    }

}
