package tn.esprit.com.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import tn.esprit.com.entities.Color;
import tn.esprit.com.entities.Skieur;
import tn.esprit.com.services.ISkieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
@RequestMapping("api/skieur")
public class SkieurController {
    private final ISkieurService skieurService;
    @GetMapping("/getAllSkieurs")
    public Iterable<Skieur> getAllSkieur(){
        return  skieurService.retrieveAllSKieur();
    }
    @PutMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur ski){
        return  skieurService.addSkieur(ski);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteSkieur(@PathVariable Integer id){
         skieurService.removeSkieurById(id);
         System.out.println("user with id = "+ id +  "and name + "+skieurService.retrieveSkieur(id).getNomS()+"is deleted" );
    }
    @PostMapping("/updateSkieur")
    public Skieur updateSkieurById(@RequestBody Skieur ski){
        return skieurService.updateSkieur(ski);
    }
    @GetMapping("/get/{id}")
    public Skieur getSkieurById(@PathVariable Integer id){
        return skieurService.retrieveSkieur(id);
    }
    @PostMapping("/addMany")
    public List<Skieur> addlist(@RequestBody List<Skieur> L){
        return skieurService.ajoutListSkieur(L);
    }
    @GetMapping("/{c}")
    public List<Skieur> findByPisteColor(@PathVariable Color c){
        return  skieurService.findBySkieurPisteColor(c);
    }
}
