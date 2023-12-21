package gob.bo.segip.proyecto.modulo_parametricas.dominio.entidad;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "parametrica.unidades_de_medida")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnidadMedidaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unidad_medida")
    private Long id;

    private String nombre, abreviatura;
    private Boolean es_activo;

}
