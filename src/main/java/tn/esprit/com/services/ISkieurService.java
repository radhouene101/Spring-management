package tn.esprit.com.services;


import tn.esprit.com.entities.Skieur;

import java.util.List;

public interface ISkieurService {

    Skieur addSkieur(Skieur ski);
    Skieur updateSkieur(Skieur ski);
    void removeSkieur(Skieur ski);
    void removeSkieurById(Integer ski);
    Skieur retrieveSkieur(Integer idSkieur);
    List<Skieur> retrieveAllSKieur();
    List<Skieur> ajoutListSkieur(List<Skieur> list);

}
