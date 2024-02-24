package tn.esprit.spring.projetspringclasse.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.projetspringclasse.entity.Inscription;
import tn.esprit.spring.projetspringclasse.entity.Skieur;
import tn.esprit.spring.projetspringclasse.repository.InscriptionRepository;
import tn.esprit.spring.projetspringclasse.repository.SkieurRepository;
import tn.esprit.spring.projetspringclasse.service.InscriptionService;

@Service
@AllArgsConstructor
public class InscriptionServiceImpl implements InscriptionService {

    private InscriptionRepository inscriptionRepository;
    private SkieurRepository skieurRepository;

    @Override
    public Inscription addRegistrationAndAssignToSkier(Inscription registration, Long numSkier) {
        Skieur skieur =skieurRepository.findById(numSkier).orElse(null);
        registration.setSkieur(skieur);


        return inscriptionRepository.save(registration);
    }
}