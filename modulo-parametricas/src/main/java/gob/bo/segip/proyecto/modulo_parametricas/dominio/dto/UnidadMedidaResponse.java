package gob.bo.segip.proyecto.modulo_parametricas.dominio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnidadMedidaResponse {

    private Long id;
    private String nombre;

}
