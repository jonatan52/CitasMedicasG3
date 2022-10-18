
package com.backend.citas.Models;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Table
@Entity(name = "detalleformula")
public class DetalleFormula implements Serializable {

    @Id
    @Column(name = "idFormula")
    private int idFormula;
    @ManyToOne
    @JoinColumn(name = "idMedicamento")
    private Medicamentos idmedicamento;
    @Column(name = "Cantidad")
    private int cantidad;

    public DetalleFormula(int idFormula, Medicamentos idmedicamento, int cantidad) {
        this.idFormula = idFormula;
        this.idmedicamento = idmedicamento;
        this.cantidad = cantidad;
    }

    public DetalleFormula() {
    }

    public int getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(int idFormula) {
        this.idFormula = idFormula;
    }

    public Medicamentos getIdmedicamento() {
        return idmedicamento;
    }

    public void setIdmedicamento(Medicamentos idmedicamento) {
        this.idmedicamento = idmedicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
    
