package agenda.gestionPersonas.application.service;

import agenda.gestionPersonas.domain.dto.PersonaCreator;
import org.springframework.http.ResponseEntity;

public interface PersonaService {

    public ResponseEntity<?> findAll();

    public ResponseEntity<?> getOneById(String ID);

    public ResponseEntity<?> newOne(PersonaCreator creator);

    public ResponseEntity<?> editOne(PersonaCreator creator, String ID);

    public ResponseEntity<?> deleteOne(String ID);
}
