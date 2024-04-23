package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.com.entities.Abonnement;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
    List<Abonnement> findByDateFin(LocalDate date);
}
