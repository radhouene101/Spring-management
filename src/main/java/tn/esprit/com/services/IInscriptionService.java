package tn.esprit.com.services;

import tn.esprit.com.entities.Inscription;

public interface IInscriptionService {
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Inscription retrieveInscriptionById(Integer id);
    Inscription retrieveInscription(Inscription inscription);
    void removeInscriptionById(Integer id);
    void removeInscription(Inscription inscription);
}
