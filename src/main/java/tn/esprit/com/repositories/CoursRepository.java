package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.com.entities.Cours;

import java.util.List;

@Repository
public interface CoursRepository extends JpaRepository<Cours,Long> {
}
