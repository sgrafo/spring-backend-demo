package gob.bo.segip.proyecto.modulo_parametricas.dominio.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarroDTO {

    private Long id;
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private Integer anio;
    private Integer precio;
    private PropietarioDTO propietario;

}
