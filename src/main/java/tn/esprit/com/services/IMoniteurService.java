package tn.esprit.com.services;

import tn.esprit.com.entities.Moniteur;

public interface IMoniteurService {
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur(Moniteur moniteur);
    Moniteur retrieveMoniteurById(Integer id);
    Moniteur retrieveMoniteur(Moniteur moniteur);
    void removeMoniteur(Moniteur moniteur);
    void removeMoniteurById(Integer id);
}
