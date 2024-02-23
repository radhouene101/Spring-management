package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.com.entities.Abonnement;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
}
