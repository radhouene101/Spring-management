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
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDcours")
    private long numCours;

    @Column(name = "niveau")
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;

    @Column(name = "support")
    private Support support;

    @Column(name = "prix")
    private Float prix;

    @Column(name = "creneau")
    private int creneau;

    @OneToMany(mappedBy ="cours")
    private List<Inscription> inscriptions;

}
