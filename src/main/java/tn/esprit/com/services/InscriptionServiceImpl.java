package tn.esprit.com.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Inscription;
import tn.esprit.com.repositories.InscriptionRepository;


@Service
@AllArgsConstructor
public class InscriptionServiceImpl implements IInscriptionService{

    InscriptionRepository inscriptionRepository;
    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription retrieveInscriptionById(Integer id) {
        return inscriptionRepository.findById((long) id).get();
    }

    @Override
    public Inscription retrieveInscription(Inscription inscription) {
        return null;
    }

    @Override
    public void removeInscriptionById(Integer id) {
        inscriptionRepository.deleteById((long)id);
    }

    @Override
    public void removeInscription(Inscription inscription) {
        inscriptionRepository.delete(inscription);
    }
}
