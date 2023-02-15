package agenda.gestionPersonas.infra.controller;

import agenda.gestionPersonas.domain.dto.PersonaCreator;
import agenda.shared.config.EndpointUrls;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping(EndpointUrls.Base)
public interface PersonaAPI {

    //GET HTTP requests
    @GetMapping
    public ResponseEntity<?> findAll();

    @GetMapping(EndpointUrls.requiresID)
    public ResponseEntity<?> getOneById(@PathVariable Integer id);

    //POST HTTP requests
    @PostMapping
    public ResponseEntity<?> newOne(@RequestBody PersonaCreator newData);

    //PUT HTTP requests
    @PutMapping(EndpointUrls.requiresID)
    public ResponseEntity<?> editOne(@RequestBody PersonaCreator editData, @PathVariable Integer id);

    //DELETE HTTP requests
    @DeleteMapping(EndpointUrls.requiresID)
    public ResponseEntity<?> deleteOne(@PathVariable Integer id);
}
