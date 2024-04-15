package tn.esprit.com.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Piste;
import tn.esprit.com.repositories.PisteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServiceImpl implements IPisteService{
    PisteRepository pisteRepository;
    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }
    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }
    @Override
    public Piste getPiste(Integer id) {
        return pisteRepository.findById((long)id).get();
    }
    @Override
    public List<Piste> getAllPistes() {
        return pisteRepository.findAll();
    }
    @Override
    public void removePiste(Piste piste) {
        pisteRepository.delete(piste);
    }
    @Override
    public void removePisteById(Integer id){
        pisteRepository.deleteById((long)id);
    }

}
