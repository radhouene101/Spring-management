package tn.esprit.com.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Abonnement")
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numAbon")
    private long numAbon;
    @Column(name = "dateDebut")
    private LocalDate dateDebut;
    @Column(name = "dateFin")
    private LocalDate dateFin;
    @Column(name = "prixAbon")
    private Float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbonnement;
}
