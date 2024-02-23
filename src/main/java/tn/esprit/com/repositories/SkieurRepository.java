package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.com.entities.Skieur;
@Repository

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
}
