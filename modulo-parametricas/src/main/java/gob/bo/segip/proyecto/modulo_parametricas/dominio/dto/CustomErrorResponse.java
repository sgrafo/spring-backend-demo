package gob.bo.segip.proyecto.modulo_parametricas.dominio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomErrorResponse {

    private LocalDateTime timestamp;
    private String message;
    private String moreDetails;

}
