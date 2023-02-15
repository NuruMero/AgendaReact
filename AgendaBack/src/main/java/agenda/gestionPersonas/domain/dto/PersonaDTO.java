package agenda.gestionPersonas.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonaDTO {

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
