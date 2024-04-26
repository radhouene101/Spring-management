package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.com.entities.Inscription;
import tn.esprit.com.entities.Support;

import java.util.List;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
    //Inscription
    @Query("SELECT inscription.numSemaine from Inscription  inscription " +
            "join Moniteur  moniteur on inscription.cours member moniteur.cours " +
            "where moniteur.numMoniteur =:  numMoniteur " +
            "and inscription.cours.support=: support")
    List<Integer> numWeeksOfCoursBySupport(@Param("numMoniteur") Long numMoniteur , @Param("support")Support support);
}
