package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tTipoBebida")
@Data
public class TipoBebida {

    @Id
    @Column(name="idTipoBebida")
    private Integer idTipoBebida;
    @Column(name="descripcion")
    private String descripcion;

}
