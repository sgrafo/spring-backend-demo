package gob.bo.segip.proyecto.modulo_parametricas.controlador;

import gob.bo.segip.proyecto.modulo_parametricas.dominio.dto.CarroDTO;
import gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad.CarroEntity;
import gob.bo.segip.proyecto.modulo_parametricas.servicio.CarroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carros")
@RequiredArgsConstructor
public class CarroController {


    private final CarroService carroService;

    @GetMapping
    public List<CarroDTO> getCars() {
        return this.carroService.obtenerTodosLosCarros();
    }

//    @GetMapping
//    public List<CarroEntity> getCars() {
//
//        return this.carroService.obtenerTodos();
//    }

}
