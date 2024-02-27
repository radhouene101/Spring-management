package tn.esprit.com.services;

import tn.esprit.com.entities.Cours;

public interface ICoursService {
    Cours addCours(Cours cours);

    Cours updateCours(Cours cours);

    Cours retrieveCoursById(Integer id);

    Cours retrieveCours(Cours cours);

    void removeCours(Cours cours);

    void removeCoursById(Integer id);
}
