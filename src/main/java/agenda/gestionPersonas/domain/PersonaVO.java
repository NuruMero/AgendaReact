package agenda.gestionPersonas.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class PersonaVO {

    @Id
    private Integer ID;

    //Datos personales
    private String nombre;
    private String apellido;
    private LocalDate fnacimiento;

    //Datos localizacion
    private Integer codpostal;
    private String ciudad;
    private String direccion;

    //Datos contacto
    private Integer telefono;
    private String gmail;
}
