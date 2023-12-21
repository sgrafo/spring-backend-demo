package gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(schema = "historico", name = "carros")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carro_id")
    private Long id;

    private String marca, modelo, color, placa;
    private Integer anio, precio;

    // relacion muchos a uno

    @ManyToOne(targetEntity= PropietarioEntity.class)
//    @JoinColumn(name = "propietario_id")
    private PropietarioEntity propietario;

}
