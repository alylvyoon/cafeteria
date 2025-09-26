package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tIngrediente")
@Data
public class Ingrediente {

    @Id
    @Column(name="idIngrediente")
    private Integer idIngrediente;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="costo")
    private double costo;

}
