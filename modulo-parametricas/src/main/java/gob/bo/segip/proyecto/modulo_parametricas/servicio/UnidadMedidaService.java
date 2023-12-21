package gob.bo.segip.proyecto.modulo_parametricas.servicio;

import gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad.UnidadMedidaEntity;
import gob.bo.segip.proyecto.modulo_parametricas.dominio.dto.UnidadMedidaResponse;
import gob.bo.segip.proyecto.modulo_parametricas.repositorio.IUnidadMedidaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UnidadMedidaService {

    private final IUnidadMedidaRepository unidadMedidaRepository;

    private UnidadMedidaResponse mapearAUnidadDeMedidaResponse(UnidadMedidaEntity pUnidadMedida) {

        return UnidadMedidaResponse.builder()
                .id(pUnidadMedida.getId())
                .nombre(pUnidadMedida.getNombre())
                .build();

    }

    public List<UnidadMedidaResponse> obtenerTodasLasUnidades() {

        var unidades_de_medida = this.unidadMedidaRepository.findAll();
        return unidades_de_medida.stream().map(this::mapearAUnidadDeMedidaResponse).toList();

    }

}
