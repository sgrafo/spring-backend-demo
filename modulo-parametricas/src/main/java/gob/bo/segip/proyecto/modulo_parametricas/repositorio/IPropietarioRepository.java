package gob.bo.segip.proyecto.modulo_parametricas.repositorio;

import gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad.PropietarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPropietarioRepository extends JpaRepository<PropietarioEntity, Long> {
}
