package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.com.entities.Moniteur;

import java.util.List;

@Repository
public interface MoniteurRepository extends JpaRepository<Moniteur,Long> {



}
