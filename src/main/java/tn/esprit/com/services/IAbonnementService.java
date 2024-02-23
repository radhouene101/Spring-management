package tn.esprit.com.services;

import tn.esprit.com.entities.Abonnement;
import tn.esprit.com.entities.Skieur;

import java.util.List;

public interface IAbonnementService {
    Abonnement addAbonnement(Abonnement abn);
    Abonnement updateAbonnement(Abonnement abn);
    Abonnement updateAbonnementByID(Abonnement abn);
    void removeAbonnement(Abonnement abn);
    void removeAbonnementById(Integer abn);
    Abonnement retrieveAbonnement(Integer idAbn);
    List<Abonnement> retrieveAllAbonnements();
}
