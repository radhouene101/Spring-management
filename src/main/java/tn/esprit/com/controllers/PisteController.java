package tn.esprit.com.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import tn.esprit.com.entities.Piste;
import tn.esprit.com.services.IPisteService;

import java.util.List;

@AllArgsConstructor
@RequestMapping("api/piste")
@FieldDefaults(level = AccessLevel.PUBLIC)
@RestController
public class PisteController {
    IPisteService iPisteService;
    @GetMapping("/getAll")
    public List<Piste> getAllPistes(){
        return iPisteService.getAllPistes();
    }
    @PutMapping("/add")
    public Piste addPiste(@RequestBody  Piste piste){
        return iPisteService.addPiste(piste);
    }
    @DeleteMapping("/delete/{id}")
    public void deletePiste(@PathVariable Integer id){
        iPisteService.removePisteById(id);
    }
    @PostMapping("/update")
    public Piste updatePiste(@RequestBody Piste piste){
        return iPisteService.updatePiste(piste);
    }
}
