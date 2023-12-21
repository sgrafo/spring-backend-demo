package gob.bo.segip.proyecto.modulo_parametricas.dominio.record;

import gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad.PropietarioEntity;

public record CarroResponse(Long id, String marca, String modelo, String color, String placa, Integer anio,
                            Integer precio, PropietarioEntity propietario) {
}
