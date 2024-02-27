package tn.esprit.com.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import tn.esprit.com.entities.Inscription;
import tn.esprit.com.services.IInscriptionService;

import java.util.List;

@AllArgsConstructor
@RestController
@FieldDefaults(level = AccessLevel.PUBLIC)
@RequestMapping("api/inscription")
public class InscriptionController {

    IInscriptionService iInscriptionService;
    @GetMapping("/getAll")
    public Iterable<Inscription> getAllInscriptions(){
        return iInscriptionService.retrieveAllInscriptions();
    }
    @PutMapping("/add")
    public Inscription addInscription(@RequestBody Inscription inscription){
        return iInscriptionService.addInscription(inscription);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteInscription(@PathVariable Integer id){
        iInscriptionService.removeInscriptionById(id);
    }
    @PostMapping("/update")
    public Inscription updateInscription(@RequestBody Inscription inscription){
        return iInscriptionService.updateInscription(inscription);
    }
    @GetMapping("/get/{id}")
    public Inscription getInscriptionById(@PathVariable Integer id){
        return iInscriptionService.retrieveInscriptionById(id);
    }


}
