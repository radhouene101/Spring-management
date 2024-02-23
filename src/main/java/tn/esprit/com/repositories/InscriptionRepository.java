package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.com.entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
