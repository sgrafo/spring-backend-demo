package gob.bo.segip.proyecto.modulo_parametricas.repositorio;

import gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
