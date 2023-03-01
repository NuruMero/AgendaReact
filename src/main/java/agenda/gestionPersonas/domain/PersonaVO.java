package agenda.gestionPersonas.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class PersonaVO {

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
