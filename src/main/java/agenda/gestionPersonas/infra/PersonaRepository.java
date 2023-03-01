package agenda.gestionPersonas.infra;

import agenda.gestionPersonas.domain.PersonaVO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends MongoRepository<PersonaVO, String> {
}
