package com.backend.citasMedicas.Models;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Table
@Entity(name = "detalleformula")
public class DetalleFormula implements Serializable {

    @Id
    @Column(name = "idFormula")
    private int idFormula;

    @OneToOne
    @JoinColumn(name = "idMedicamento")
    private Medicamentos medicamentos;

    @Column(name = "cantidad")
    private int cantidad;

    // Constructor
    public DetalleFormula(int idFormula, Medicamentos medicamentos, int cantidad) {
        this.idFormula = idFormula;
        this.medicamentos = medicamentos;
        this.cantidad = cantidad;
    }

    public DetalleFormula() {
    }

    // Get and Set
    public int getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(int idFormula) {
        this.idFormula = idFormula;
    }

    public Medicamentos getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Medicamentos medicamentos) {
        this.medicamentos = medicamentos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
