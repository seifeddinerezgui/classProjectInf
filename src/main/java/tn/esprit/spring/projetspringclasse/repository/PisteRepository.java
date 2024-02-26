package tn.esprit.spring.projetspringclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.projetspringclasse.entity.Piste;

import java.util.List;

public interface PisteRepository extends JpaRepository<Piste,Long> {

    //Récupérer la liste des pistes d'un skieur
    List<Piste> findBySkieurs(Long numSkieur);
    //Récupérer la liste des pistes par le nom d'un Skieur ainsi que le numéro d'inscription
    List<Piste> findBySkieurNomSkieurAndInsciptionNumInscription(String nomSkieur, Long numInscription);
    //Récupérer la liste des pistes des Skieurs qui ont un nom "ABC"
    List<Piste> findBySkieurNomSkieurLike(String nomSkieur);
}
