package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.com.entities.Abonnement;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {

}
