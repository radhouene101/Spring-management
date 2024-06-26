package tn.esprit.com.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Cours;
import tn.esprit.com.repositories.AbonnementRepository;
import tn.esprit.com.repositories.CoursRepository;

import java.util.List;


@Service
@AllArgsConstructor
@Slf4j
public class CoursServiceImpl implements ICoursService{
    CoursRepository coursRepository;
    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours retrieveCoursById(Integer id) {
        return coursRepository.findById((long)id).get();
    }

    @Override
    public Cours retrieveCours(Cours cours) {
        return null;
    }

    @Override
    public List<Cours> retrieveAllCours() {
        return coursRepository.findAll();
    }


    @Override
    public void removeCours(Cours cours) {
        coursRepository.delete(cours);
    }

    @Override
    public void removeCoursById(Integer id) {
        coursRepository.deleteById((long)id);
    }
    //@Scheduled(cron = "1/2 * * * * *")
    public void test(){
        log.info("test is running");
    }
}
