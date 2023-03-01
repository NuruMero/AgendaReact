package agenda.gestionPersonas.application.service.impl;

import agenda.gestionPersonas.application.converter.PersonaDTOConverter;
import agenda.gestionPersonas.application.service.PersonaService;
import agenda.gestionPersonas.domain.PersonaVO;
import agenda.gestionPersonas.domain.dto.PersonaCreator;
import agenda.gestionPersonas.domain.dto.PersonaDTO;
import agenda.gestionPersonas.infra.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepo;

    @Autowired
    private PersonaDTOConverter personaConverter;


    @Override
    public ResponseEntity<?> findAll() {
        List<PersonaVO> personalist = personaRepo.findAll();
        if (personalist.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            List<PersonaDTO> dtoList = personalist.stream().map(personaConverter::fromVOtoDTO).collect(Collectors.toList());
            return ResponseEntity.ok(dtoList);
        }
    }

    @Override
    public ResponseEntity<?> getOneById(String ID) {
        PersonaVO persona = personaRepo.findById(ID).orElse(null);
        if (persona == null) {
            return ResponseEntity.notFound().build();
        } else {
            PersonaDTO dto = personaConverter.fromVOtoDTO(persona);
            return ResponseEntity.ok(dto);
        }
    }

    @Override
    public ResponseEntity<?> newOne(PersonaCreator creator) {
        PersonaVO personaNueva = personaConverter.fromCreatorToVO(creator);
        return ResponseEntity.status(HttpStatus.CREATED).body(personaRepo.save(personaNueva));
    }

    @Override
    public ResponseEntity<?> editOne(PersonaCreator creator, String ID) {
        return personaRepo.findById(ID).map(persona -> {
            persona = personaConverter.fromCreatorToVO(creator);
            persona.setID(ID);
            return ResponseEntity.ok((personaRepo.save(persona)));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<?> deleteOne(String ID) {
        personaRepo.deleteById(ID);
        return ResponseEntity.noContent().build();
    }
}
