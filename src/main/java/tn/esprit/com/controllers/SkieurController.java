package tn.esprit.com.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.entities.Skieur;
import tn.esprit.com.services.ISkieurService;

@RestController
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
@RequestMapping("api/skieur")
public class SkieurController {
    ISkieurService skieurService;
    @GetMapping("/getAllSkieurs")
    public Iterable<Skieur> getAllSkieur(){
        return  skieurService.retrieveAllSKieur();
    }
}
