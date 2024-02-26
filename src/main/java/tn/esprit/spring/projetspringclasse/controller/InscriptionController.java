package tn.esprit.spring.projetspringclasse.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.projetspringclasse.entity.Inscription;
import tn.esprit.spring.projetspringclasse.service.InscriptionService;

@RestController
@RequestMapping("/api/inscription")
@AllArgsConstructor
public class InscriptionController {

    private InscriptionService inscriptionService;

    @PostMapping("/add/{numSkieur}")
    public Inscription addRegistrationAndAssignToSkier(@RequestBody Inscription inscription,
                                                       @PathVariable("numSkieur") Long numSkieur) {
        return inscriptionService.addRegistrationAndAssignToSkier(inscription, numSkieur);
    }



}
