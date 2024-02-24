package tn.esprit.spring.projetspringclasse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.projetspringclasse.entity.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
