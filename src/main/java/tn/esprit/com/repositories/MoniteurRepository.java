package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.com.entities.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur,Long> {
}
