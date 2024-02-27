package tn.esprit.com.services;

import tn.esprit.com.entities.Piste;

import java.util.List;

public interface IPisteService {
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    Piste getPiste(Integer id);
    List<Piste> getAllPistes();
    void removePiste(Piste piste);
    void removePisteById(Integer id);
}
