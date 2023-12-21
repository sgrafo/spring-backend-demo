package gob.bo.segip.proyecto.modulo_parametricas.controlador;

import gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad.Taco;
import gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad.TacoOrder;
import gob.bo.segip.proyecto.modulo_parametricas.repositorio.TacoRepository;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/tacos", produces = "application/json")
@CrossOrigin(origins = "http://localhost:9090")
@RequiredArgsConstructor
public class TacoController {

    private final TacoRepository tacoRepository;


//    http://localhost:9090/api/tacos/54

//    @GetMapping("/{id}")
//    public Optional<Taco> tacoById(@PathVariable("id") Long id) {
//
//        return this.tacoRepository.findById(id);
//
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Taco> tacoById(@PathVariable("id") Long id) {

        Optional<Taco> optTaco = this.tacoRepository.findById(id);

        if (optTaco.isPresent())
            return new ResponseEntity<>(optTaco.get(), HttpStatus.OK);

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }

//    http://localhost:9090/api/tacos?recent

    @GetMapping(params = "recent")
    public Iterable<Taco> recentTacos() {

        PageRequest page = PageRequest.of(0, 12, Sort.by("createdAt").descending());

        return this.tacoRepository.findAll(page).getContent();

    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Taco postTaco(@Valid @RequestBody Taco taco) {

        return this.tacoRepository.save(taco);

    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<Map<String, Object>> handleValidationExceptions(MethodArgumentNotValidException ex) {
//        Map<String, String> errors = new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach((error) -> {
//            String fieldName = ((FieldError) error).getField();
//            String errorMessage = error.getDefaultMessage();
//            errors.put(fieldName, errorMessage);
//        });
//
//        return getMapResponseEntity(errors);
//    }
//
//    @ExceptionHandler(ConstraintViolationException.class)
//    public ResponseEntity<Map<String, Object>> handleConstraintViolation(ConstraintViolationException ex) {
//        Map<String, String> errors = new HashMap<>();
//        ex.getConstraintViolations().forEach(violation -> {
//            String path = violation.getPropertyPath().toString();
//            String message = violation.getMessage();
//            errors.put(path, message);
//        });
//
//        return getMapResponseEntity(errors);
//    }
//
//    private ResponseEntity<Map<String, Object>> getMapResponseEntity(Map<String, String> errors) {
//        Map<String, Object> body = new HashMap<>();
//        body.put("timestamp", new Date());
//        body.put("status", HttpStatus.BAD_REQUEST.value());
//        body.put("errors", errors);
//
//        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
//    }

}
