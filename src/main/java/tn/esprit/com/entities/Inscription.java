package tn.esprit.com.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdInscription")
    private long numInscription;
    @Column(name = "numSemaine")
    private int numSemaine;
    @ManyToOne
    private Cours cours;
    @ManyToOne
    private Skieur skieurs;
}
