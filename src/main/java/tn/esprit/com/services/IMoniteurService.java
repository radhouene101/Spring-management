package tn.esprit.com.services;

import tn.esprit.com.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur(Moniteur moniteur);
    Moniteur retrieveMoniteurById(Integer id);
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur retrieveMoniteur(Moniteur moniteur);
    void removeMoniteur(Moniteur moniteur);
    void removeMoniteurById(Integer id);
}
