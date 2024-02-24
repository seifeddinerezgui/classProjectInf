package tn.esprit.spring.projetspringclasse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;
    @OneToMany( mappedBy = "skieur")
    private Set<Inscription> Inscriptions;
    @ManyToMany(mappedBy = "skieurs")
    private Set<Piste> pistes;
    @OneToOne
    private Abonnement abonnement;



}
