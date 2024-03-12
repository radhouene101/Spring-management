package tn.esprit.com.services;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.com.entities.Color;
import tn.esprit.com.entities.Skieur;

import java.time.LocalDate;
import java.util.List;

public interface ISkieurService {

    Skieur addSkieur(Skieur ski);
    Skieur updateSkieur(Skieur ski);
    void removeSkieur(Skieur ski);
    void removeSkieurById(Integer ski);
    Skieur retrieveSkieur(Integer idSkieur);
    List<Skieur> retrieveAllSKieur();
    List<Skieur> ajoutListSkieur(List<Skieur> list);
    List<Skieur> findByDateBetween(LocalDate debut , LocalDate fin);
    List<Skieur> findBySkieurPisteColor(Color couleurPiste);


}
