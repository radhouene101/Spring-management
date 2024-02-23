package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.com.entities.Skieur;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
}
