package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.com.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}
