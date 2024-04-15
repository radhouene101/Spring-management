package tn.esprit.com.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Inscription;
import tn.esprit.com.repositories.CoursRepository;
import tn.esprit.com.repositories.InscriptionRepository;
import tn.esprit.com.repositories.SkieurRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class InscriptionServiceImpl implements IInscriptionService{

    InscriptionRepository inscriptionRepository;
    SkieurRepository sk;
    CoursRepository cr;
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
    public List<Inscription> retrieveAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public void removeInscriptionById(Integer id) {
        inscriptionRepository.deleteById((long)id);
    }

    @Override
    public void removeInscription(Inscription inscription) {
        inscriptionRepository.delete(inscription);
    }
    public void addRegistrationAndAssignToSkier(
            Inscription inscription,
            int id
    ){
        inscription.setSkieurs(sk.findById((long)id).get());
        inscriptionRepository.save(inscription);
    }
    public void assignRegistrationToCourse(
            int insId,
            int courseId
    ){
        Inscription ins = inscriptionRepository.findById((long)insId).get();
        ins.setCours(cr.findById((long)courseId).get());
        inscriptionRepository.save(ins);
    }

}
