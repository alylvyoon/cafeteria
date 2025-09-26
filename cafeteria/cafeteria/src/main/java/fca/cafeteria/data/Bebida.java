package fca.cafeteria.data;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tBebida")
@Data
public class Bebida {

    @Id
    @Column(name="idBebida")
    private Integer idBebida;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="idTipoBebida")
    private TipoBebida tipoBebida;

}
