package gob.bo.segip.proyecto.modulo_parametricas.repositorio;

import gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad.Taco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacoRepository extends JpaRepository<Taco, Long> {
}
