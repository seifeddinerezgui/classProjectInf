package tn.esprit.spring.projetspringclasse.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.projetspringclasse.entity.Cours;
import tn.esprit.spring.projetspringclasse.service.CoursService;

import java.util.List;

@RestController
@RequestMapping("/api/cour")
@AllArgsConstructor
public class CoursController {

    private final CoursService coursService;

    @GetMapping
    public List<Cours> retrieveAllCourses() {
        return coursService.retrieveAllCourses();
    }

    @PostMapping("/addCour")
    public Cours addCours(@RequestBody Cours cours) {
        return coursService.addCours(cours);
    }

    @PutMapping("/{numCours}")
    public Cours updateCours(@PathVariable Long numCours, @RequestBody Cours cours) {
        cours.setNumCours(numCours); // Ensure ID matches path variable
        return coursService.updateCours(cours);
    }

    @GetMapping("/{numCours}")
    public Cours retrieveCours(@PathVariable Long numCours) {
        return coursService.retrieveCours(numCours);
    }
//    @GetMapping
//    public Cours findInscriptionNumInscription(long inscriptionNum){
//        return coursService.findInscriptionNumInscription(inscriptionNum);
//    }
}
