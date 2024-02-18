package tn.esprit.com.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDmoniteur")
    private long numMoniteur;
    @Column(name = "nomM")
    private String nomM;
    @Column(name = "prenomM")
    private String prenomM;
    @Column(name = "DateRecru")
    private Date dateRecru;
    @OneToMany
    private List<Cours> cours;

}
