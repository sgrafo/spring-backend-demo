package gob.bo.segip.proyecto.modulo_parametricas.dominio.record;

import java.sql.Date;
import java.util.List;

public record PropietarioResponse(Long id, String ci, String nombres, String apellidos, Date fechaNacimiento,
                                  List<CarroResponse> autos) {
}
