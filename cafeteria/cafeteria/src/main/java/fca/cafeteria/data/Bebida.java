package fca.cafeteria.data;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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


}
