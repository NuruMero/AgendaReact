package agenda.gestionPersonas.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonaDTO {

    @Id
    private String ID;

    //Datos personales
    private String nombre;
    private String apellido;

    //Datos localizacion
    private Integer codpostal;
    private String ciudad;
    private String direccion;

    //Datos contacto
    private Integer telefono;
    private String gmail;
}
