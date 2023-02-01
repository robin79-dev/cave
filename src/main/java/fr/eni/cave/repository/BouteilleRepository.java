package fr.eni.cave.repository;

import fr.eni.cave.entities.Bouteille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BouteilleRepository extends JpaRepository<Bouteille, Integer> {
}
