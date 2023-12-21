package gob.bo.segip.proyecto.modulo_parametricas.controlador;

import gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad.Ingredient;
import gob.bo.segip.proyecto.modulo_parametricas.repositorio.IngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/ingredients", produces = "application/json")
@CrossOrigin(origins = "http://localhost:9090")
@RequiredArgsConstructor
public class IngredientController {

    private final IngredientRepository ingredientRepository;

//    http://localhost:9090/api/ingredients

    @GetMapping
    public Iterable<Ingredient> allIngredients() {
        return this.ingredientRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ingredient saveIngredient(@RequestBody Ingredient ingredient) {
        return this.ingredientRepository.save(ingredient);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteIngredient(@PathVariable("id") String ingredientId) {
        this.ingredientRepository.deleteById(ingredientId);
    }

}
