package tn.esprit.com.services;

import tn.esprit.com.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Inscription retrieveInscriptionById(Integer id);
    Inscription retrieveInscription(Inscription inscription);
    List<Inscription> retrieveAllInscriptions();
    void removeInscriptionById(Integer id);
    void removeInscription(Inscription inscription);

}
