package agenda.gestionPersonas.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonaCreator {

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
