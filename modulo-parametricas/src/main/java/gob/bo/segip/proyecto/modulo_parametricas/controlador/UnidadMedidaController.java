package gob.bo.segip.proyecto.modulo_parametricas.controlador;

import gob.bo.segip.proyecto.modulo_parametricas.dominio.dto.UnidadMedidaResponse;
import gob.bo.segip.proyecto.modulo_parametricas.servicio.UnidadMedidaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/unidades")
@RequiredArgsConstructor
public class UnidadMedidaController {

    private final UnidadMedidaService unidadMedidaService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UnidadMedidaResponse> getObtenerTodasLasUnidades() {

        return this.unidadMedidaService.obtenerTodasLasUnidades();

    }

}
