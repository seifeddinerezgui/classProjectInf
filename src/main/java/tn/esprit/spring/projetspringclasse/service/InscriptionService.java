package tn.esprit.spring.projetspringclasse.service;

import jakarta.servlet.Registration;
import tn.esprit.spring.projetspringclasse.entity.Inscription;

public interface InscriptionService {
    Inscription addRegistrationAndAssignToSkier(Inscription inscription, Long numSkieur);
}
