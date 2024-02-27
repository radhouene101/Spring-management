package tn.esprit.com.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Cours;
import tn.esprit.com.repositories.AbonnementRepository;
import tn.esprit.com.repositories.CoursRepository;


@Service
@AllArgsConstructor
public class CoursServiceImpl implements ICoursService{
    CoursRepository coursRepository;
    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return null;
    }

    @Override
    public Cours retrieveCoursById(Integer id) {
        return null;
    }

    @Override
    public Cours retrieveCours(Cours cours) {
        return null;
    }

    @Override
    public void removeCours(Cours cours) {

    }

    @Override
    public void removeCoursById(Integer id) {

    }
}
