package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.com.entities.Inscription;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
