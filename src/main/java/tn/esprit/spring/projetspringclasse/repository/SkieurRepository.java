package tn.esprit.spring.projetspringclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.projetspringclasse.entity.Piste;
import tn.esprit.spring.projetspringclasse.entity.Skieur;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    //Récupérer la liste des skieur by piste
    List<Skieur> findByPisteNumPiste(Long numPiste);
}
