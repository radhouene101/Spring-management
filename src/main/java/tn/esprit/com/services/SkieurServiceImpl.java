package tn.esprit.com.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Skieur;
import tn.esprit.com.repositories.SkieurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SkieurServiceImpl implements ISkieurService {
    SkieurRepository skieurRepository;

    @Override
    public Skieur addSkieur(Skieur ski) {
        return skieurRepository.save(ski);
    }

    @Override
    public Skieur updateSkieur(Skieur ski) {
        return skieurRepository.save(ski);
    }

    @Override
    public void removeSkieur(Skieur ski) {
        skieurRepository.delete(ski);
    }

    @Override
    public void removeSkieurById(Integer ski) {
        skieurRepository.deleteById((long)ski);
    }

    @Override
    public Skieur retrieveSkieur(Integer idSkieur) {
        return skieurRepository.getReferenceById((long)idSkieur);
    }

    @Override
    public List<Skieur> retrieveAllSKieyr() {
        return skieurRepository.findAll();
    }
}
