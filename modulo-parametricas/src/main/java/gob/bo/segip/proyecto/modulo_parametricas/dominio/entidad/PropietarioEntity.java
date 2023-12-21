package gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "historico", name = "propietarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropietarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "propietario_id")
    private Long id;

    private String ci, nombres, apellidos;
    private Date fechaNacimiento;

    // relacion de uno a muchos

//    @OneToMany(mappedBy = "propietario")
    @OneToMany(targetEntity = CarroEntity.class)
    private List<CarroEntity> carros = new ArrayList<>();;

}
