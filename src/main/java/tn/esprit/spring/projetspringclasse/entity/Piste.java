package tn.esprit.spring.projetspringclasse.entity;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.spring.projetspringclasse.enumeration.Couleur;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "PisteT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private Integer longueur;
    private Integer pente;
    @ManyToMany
    private Set<Skieur> skieurs;

}
