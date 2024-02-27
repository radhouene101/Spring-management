package tn.esprit.com.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import tn.esprit.com.entities.Cours;
import tn.esprit.com.services.ICoursService;

import java.util.List;


@AllArgsConstructor
@RestController
@FieldDefaults(level = AccessLevel.PUBLIC)
@RequestMapping("api/cours")
public class CoursController {
    ICoursService iCoursService;

    @PutMapping("/add")
    public Cours addCours(@RequestBody Cours cours){
        return iCoursService.addCours(cours);
    }

    @GetMapping("/getAll")
    public Iterable<Cours> retrieveAllCours(){
        return iCoursService.retrieveAllCours();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCours(@PathVariable Integer id){
        iCoursService.removeCoursById(id);
    }

    @PostMapping("/update")
    public Cours updateCours(@RequestBody Cours cours){
        return iCoursService.updateCours(cours);
    }
    @GetMapping("/get/{id}")

}
