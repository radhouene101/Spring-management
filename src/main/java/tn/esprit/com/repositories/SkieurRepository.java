package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.com.entities.Abonnement;
import tn.esprit.com.entities.Color;
import tn.esprit.com.entities.Skieur;
import tn.esprit.com.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    Skieur findByAbonnement(Abonnement abn);
    List<Skieur> findByDateNaissanceBetween(LocalDate debut , LocalDate fin);
    @Query("SELECT s FROM Skieur s JOIN s.pistes p where p.color =:c")
    List<Skieur> skieurPisteColor (@Param("c") Color c);
    @Query("SELECT s from Skieur s JOIN s.abonnement p where p.typeAbonnement = : typeAn")
    List<Skieur> retrieveSkieurByTypeAbon (@Param("typeAn")TypeAbonnement subscriptionType);
    List<Skieur> findByAbonnement_TypeAbonnement(TypeAbonnement t);
}
