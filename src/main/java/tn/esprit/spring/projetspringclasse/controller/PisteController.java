package tn.esprit.spring.projetspringclasse.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.projetspringclasse.entity.Piste;
import tn.esprit.spring.projetspringclasse.service.PisteService;

import java.util.List;

@RestController
@RequestMapping("/pistes")
@AllArgsConstructor
public class PisteController {

    private final PisteService pisteService;

    @GetMapping
    public List<Piste> retrieveAllPistes() {
        return pisteService.retrieveAllPistes();
    }

    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }

    @PutMapping("/{numPiste}")
    public Piste updatePiste(@PathVariable Long numPiste, @RequestBody Piste piste) {
        piste.setNumPiste(numPiste); // Ensure ID matches path variable
        return pisteService.updatePiste(piste);
    }

    @GetMapping("/{numPiste}")
    public Piste retrievePiste(@PathVariable Long numPiste) {
        return pisteService.retrievePiste(numPiste);
    }
}
