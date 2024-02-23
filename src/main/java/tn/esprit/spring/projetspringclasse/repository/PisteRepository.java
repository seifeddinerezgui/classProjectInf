package tn.esprit.spring.projetspringclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.projetspringclasse.entity.Piste;

public interface PisteRepository extends JpaRepository<Piste,Long> {
}
