package tn.esprit.com.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.entities.Cours;
import tn.esprit.com.services.ICoursService;


@AllArgsConstructor
@RestController
@FieldDefaults(level = AccessLevel.PUBLIC)
@RequestMapping("api/cours")
public class CoursController {
    ICoursService iCoursService;
    public Cours addCours(Cours cours){
        return iCoursService.addCours(cours);
    }

}
