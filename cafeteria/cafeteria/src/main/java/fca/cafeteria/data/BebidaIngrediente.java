package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tBebidaIngrediente")
@Data //para no escribir hashcode, getters, setter, equals
public class BebidaIngrediente {

    @Id
    @Column(name="idBebidaIngrediente")
    private Integer idBebidaIngrediente;
    @Column(name="cantidad")
    private int cantidad;

}
