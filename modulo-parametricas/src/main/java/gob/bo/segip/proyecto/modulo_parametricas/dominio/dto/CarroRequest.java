package gob.bo.segip.proyecto.modulo_parametricas.dominio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarroRequest {

    private Long id;
    private String marca, modelo, color, placa;
    private Integer anio, precio;

}
