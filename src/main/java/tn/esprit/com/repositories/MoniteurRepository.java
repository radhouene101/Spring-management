package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.com.entities.Moniteur;

@Repository
public interface MoniteurRepository extends JpaRepository<Moniteur,Long> {
}
