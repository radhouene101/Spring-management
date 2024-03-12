package tn.esprit.com.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Color;
import tn.esprit.com.entities.Skieur;
import tn.esprit.com.repositories.SkieurRepository;

import java.time.LocalDate;
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
        return skieurRepository.findById((long)idSkieur).get();
    }

    @Override
    public List<Skieur> retrieveAllSKieur() {
        return skieurRepository.findAll();
    }

    @Override
    public List<Skieur> ajoutListSkieur(List<Skieur> list) {
        return skieurRepository.saveAll(list);
    }

    @Override
    public List<Skieur> findByDateBetween(LocalDate debut, LocalDate fin) {
        return skieurRepository.findByDateNaissanceBetween(debut,fin);
    }

    @Override
    public List<Skieur> findBySkieurPisteColor(Color couleurPiste) {
        return skieurRepository.skieurPisteColor(couleurPiste);
    }


}
