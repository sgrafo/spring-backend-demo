package gob.bo.segip.proyecto.modulo_parametricas.servicio;

import gob.bo.segip.proyecto.modulo_parametricas.dominio.dto.CarroDTO;
import gob.bo.segip.proyecto.modulo_parametricas.dominio.dto.PropietarioDTO;
import gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad.CarroEntity;
import gob.bo.segip.proyecto.modulo_parametricas.repositorio.ICarroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarroService {

    private final ICarroRepository carroRepository;

//    private CarroResponse mapToCarroResponse(CarroEntity pCarro) {
//
//        return new CarroResponse(
//                pCarro.getId(),
//                pCarro.getMarca(),
//                pCarro.getModelo(),
//                pCarro.getColor(),
//                pCarro.getPlaca(),
//                pCarro.getAnio(),
//                pCarro.getPrecio()
//        );
//
//    }

//    private PropietarioResponse mapToPropietarioResponse(PropietarioEntity pPropietario) {
//
//        return new PropietarioResponse(
//                pPropietario.getId(),
//                pPropietario.getCi(),
//                pPropietario.getNombres(),
//                pPropietario.getApellidos(),
//                pPropietario.getFechaNacimiento(),
//                pPropietario.getCarros().stream().map(this::mapToCarroResponse).toList());
//
//    }

    public List<CarroEntity> obtenerTodos() {
        return this.carroRepository.findAll();
    }

    public List<CarroDTO> obtenerTodosLosCarros() {

        List<CarroEntity> carros = this.carroRepository.obtenerTodosLosCarrosYSusPropietarios();

        List<CarroDTO> carrosDTO = new ArrayList<>();

        for (CarroEntity carro : carros) {

            CarroDTO carroDto = new CarroDTO();

            carroDto.setId(carro.getId());
            carroDto.setMarca(carro.getMarca());
            carroDto.setModelo(carro.getModelo());
            carroDto.setColor(carro.getColor());
            carroDto.setPlaca(carro.getPlaca());
            carroDto.setAnio(carro.getAnio());
            carroDto.setPrecio(carro.getPrecio());

            PropietarioDTO propietarioDto = new PropietarioDTO();

            var so = carroDto.getPropietario().getId();

            propietarioDto.setId(carroDto.getPropietario().getId());
            propietarioDto.setCi(carroDto.getPropietario().getCi());
            propietarioDto.setNombres(carroDto.getPropietario().getNombres());
            propietarioDto.setApellidos(carroDto.getPropietario().getApellidos());
            propietarioDto.setFechaNacimiento(carroDto.getPropietario().getFechaNacimiento());

            carroDto.setPropietario(propietarioDto);

            carrosDTO.add(carroDto);

        }

        return carrosDTO;

    }

}
