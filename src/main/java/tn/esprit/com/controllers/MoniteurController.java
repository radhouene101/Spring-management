package tn.esprit.com.controllers;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import tn.esprit.com.entities.Moniteur;
import tn.esprit.com.services.IMoniteurService;

import java.util.List;

@RestController
@RequestMapping("api/moniteur")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class MoniteurController {
    IMoniteurService moniteurService;
    @GetMapping("/getAll")
    public List<Moniteur> getAllMoniteurs(){
        return moniteurService.retrieveAllMoniteurs();
    }
    @PostMapping("/update")
    public Moniteur updateMoniteur(@RequestBody Moniteur mo){
        return moniteurService.updateMoniteur(mo);
    }
    @PutMapping("/add")
    public Moniteur addMoniteur(@RequestBody Moniteur mo){
        return moniteurService.addMoniteur(mo);
    }
    @DeleteMapping("/delete/{id}")
    public void DeleteMoniteur(@PathVariable Integer id){
        moniteurService.removeMoniteurById(id);
    }
    @GetMapping("/get/{id}")
    public Moniteur getMoniteurById(@PathVariable Integer id){
        return moniteurService.retrieveMoniteurById(id) ;
    }
}
