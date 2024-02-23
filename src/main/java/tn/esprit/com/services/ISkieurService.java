package tn.esprit.com.services;


import tn.esprit.com.entities.Skieur;

public interface ISkieurService {

    Skieur addSkieur(Skieur ski);
    Skieur updateSkieur(Skieur ski);
    void removeSkieur(Skieur ski);

}
