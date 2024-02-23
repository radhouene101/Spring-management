package tn.esprit.com.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import tn.esprit.com.entities.Abonnement;
import tn.esprit.com.services.IAbonnementService;

import java.util.Iterator;

@RestController
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
@RequestMapping("api/abonnement")
public class AbonnementController {
    IAbonnementService abonnementService;

    @GetMapping("/getAllAbonnement")
    public Iterable<Abonnement> getAllAbonnements(){
        return abonnementService.retrieveAllAbonnements();
    }
    @PutMapping("/addAbonnement")
    public Abonnement addAbonnement(@RequestBody Abonnement abn){
        return abonnementService.addAbonnement(abn);
    }
    @PostMapping("/updateAbonnement/{id}")
    public Abonnement updateAbonnement(@RequestBody Abonnement abn,@PathVariable Integer id){
        return abonnementService.updateAbonnementByID(abn);
    }
    @DeleteMapping("/deleteAbonnement")
    public void deleteAbonnement(@PathVariable Integer id){
        abonnementService.removeAbonnementById(id);
    }
}
