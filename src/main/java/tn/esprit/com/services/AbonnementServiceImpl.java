package tn.esprit.com.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Abonnement;
import tn.esprit.com.entities.Skieur;
import tn.esprit.com.repositories.AbonnementRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AbonnementServiceImpl implements IAbonnementService{
    AbonnementRepository abonnementRepository;
    @Override
    public Abonnement addAbonnement(Abonnement abn) {
        return abonnementRepository.save(abn);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abn) {
        return abonnementRepository.save(abn);
    }

    @Override
    public Abonnement updateAbonnementByID(Abonnement abn) {
            return abonnementRepository.save(abn);
    }

    @Override
    public void removeAbonnement(Abonnement abn) {
        abonnementRepository.delete(abn);
    }

    @Override
    public void removeAbonnementById(Integer abn) {
    abonnementRepository.deleteById((long)abn);
    }

    @Override
    public Abonnement retrieveAbonnement(Integer idAbn) {
        return abonnementRepository.findById((long)idAbn).get();
    }

    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepository.findAll();
    }
}
