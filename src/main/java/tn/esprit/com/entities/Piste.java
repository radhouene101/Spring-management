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
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "idPiste")
    private long numPiste;
    @Column(name="namePiste")
    private String namePiste;

    @Enumerated(EnumType.STRING)
    @Column(name = "color")
    private Color color;
    @ManyToMany(mappedBy = "pistes")
    private List<Skieur> skieurs;
}
