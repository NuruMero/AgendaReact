package agenda.gestionPersonas.application.converter;

import agenda.gestionPersonas.domain.PersonaVO;
import agenda.gestionPersonas.domain.dto.PersonaCreator;
import agenda.gestionPersonas.domain.dto.PersonaDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonaDTOConverter {

    private final ModelMapper modelMapper;

    public PersonaVO fromDTOtoVO(PersonaDTO dto) {
        return modelMapper.map(dto, PersonaVO.class);
    }

    public PersonaDTO fromVOtoDTO(PersonaVO vo) {
        return modelMapper.map(vo, PersonaDTO.class);
    }

    public PersonaVO fromCreatorToVO(PersonaCreator creator) {
        return modelMapper.map(creator, PersonaVO.class);
    }
}
