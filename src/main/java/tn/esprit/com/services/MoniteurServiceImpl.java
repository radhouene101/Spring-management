package tn.esprit.com.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Moniteur;
import tn.esprit.com.repositories.MoniteurRepository;

 @Service
 @AllArgsConstructor
public class MoniteurServiceImpl implements IMoniteurService{

    MoniteurRepository moniteurRepository;
    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteurById(Integer id) {
        return moniteurRepository.findById((long)id).get();
    }

    @Override
    public Moniteur retrieveMoniteur(Moniteur moniteur) {
        return null;
    }

    @Override
    public void removeMoniteur(Moniteur moniteur) {
        moniteurRepository.delete(moniteur);
    }

    @Override
    public void removeMoniteurById(Integer id) {
        moniteurRepository.deleteById((long)id);
    }
}
