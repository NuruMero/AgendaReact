package agenda.gestionPersonas.infra.controller;

import agenda.gestionPersonas.application.service.PersonaService;
import agenda.gestionPersonas.domain.dto.PersonaCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController implements PersonaAPI {
    @Autowired
    private PersonaService personaService;


    @Override
    public ResponseEntity<?> findAll() {
        return personaService.findAll();
    }

    @Override
    public ResponseEntity<?> getOneById(Integer id) {
        return personaService.getOneById(id);
    }

    @Override
    public ResponseEntity<?> newOne(PersonaCreator newData) {
        return personaService.newOne(newData);
    }

    @Override
    public ResponseEntity<?> editOne(PersonaCreator editData, Integer id) {
        return personaService.editOne(editData, id);
    }

    @Override
    public ResponseEntity<?> deleteOne(Integer id) {
        return personaService.deleteOne(id);
    }
}
