package gob.bo.segip.proyecto.modulo_parametricas.dominio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropietarioDTO {

    private Long id;
    private String ci;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;

}
