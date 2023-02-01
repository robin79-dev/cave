package fr.eni.cave.service;

import fr.eni.cave.entities.Bouteille;
import fr.eni.cave.repository.BouteilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BouteilleService{

    @Autowired
    private BouteilleRepository bouteilleRepository;

    public Bouteille saveBouteille(Bouteille bouteille){
        return bouteilleRepository.save(bouteille);
    }

}
