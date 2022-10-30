package com.backend.citasMedicas.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity(name = "medicamentos")
public class Medicamentos implements Serializable {

    @Id
    @Column(name = "idMedicamento")
    private int idMedicamento;

    @Column(name = "nombreMedicamento")
    private String nombreMedicamento;

    //Constructor
    public Medicamentos(int idMedicamento, String nombreMedicamento) {
        this.idMedicamento = idMedicamento;
        this.nombreMedicamento = nombreMedicamento;
    }

    public Medicamentos() {
    }

    //Get and Set
    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

}
