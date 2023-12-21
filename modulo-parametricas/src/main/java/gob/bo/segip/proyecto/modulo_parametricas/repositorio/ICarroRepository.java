package gob.bo.segip.proyecto.modulo_parametricas.repositorio;

import gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad.CarroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICarroRepository extends JpaRepository<CarroEntity, Long> {

    @Query("SELECT c FROM CarroEntity c JOIN FETCH c.propietario")
    List<CarroEntity> obtenerTodosLosCarrosYSusPropietarios();

    // Busca carros por marca

    List<CarroEntity> findByMarca(String pMarca);

    // Busca carros por color

    List<CarroEntity> findByColor(String pColor);

    // Busca carros por año

    List<CarroEntity> findByAnio(Integer pAnio);

    // Busca carros por marca y modelo
    List<CarroEntity> findByMarcaAndModelo(String pMarca, String pModelo);

    // Busca carros por marca y color
    List<CarroEntity> findByMarcaOrColor(String pMarca, String pColor);

    // Busca carros por marca y ordena por año
    List<CarroEntity> findByMarcaOrderByAnioAsc(String pMarca);

    // Busca carros por marca usando SQL

    @Query("select c from CarroEntity c where c.marca = ?1")
    List<CarroEntity> buscarPorMarca(String pMarca);

    // Fetch cars by brand using SQL
    @Query("select c from CarroEntity c where c.marca like %?1")
    List<CarroEntity> buscarPorMarcaQueTerminenEn(String pMarca);

}
