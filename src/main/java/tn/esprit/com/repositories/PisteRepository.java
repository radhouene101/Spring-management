package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.com.entities.Piste;

@Repository
public interface PisteRepository extends JpaRepository<Piste,Long> {
}
