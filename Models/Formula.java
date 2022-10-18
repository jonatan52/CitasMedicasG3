
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Table
@Entity(name = "formula")
public class Formula implements Serializable {

    @Id
    @Column(name = "idFormula")
    private int idFormula;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "hora")
    private Time hora;
    @OneToOne
    @JoinColumn(name = "idPaciente")
    private Pacientes idPaciente;
    @OneToOne
    @JoinColumn(name = "idDoctor")
    private Doctor idDoctor;

    public Formula(int idFormula, Date fecha, Time hora, Pacientes idPaciente, Doctor idDoctor) {
        this.idFormula = idFormula;
        this.fecha = fecha;
        this.hora = hora;
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
    }

    public Formula() {
    }

    public int getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(int idFormula) {
        this.idFormula = idFormula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Pacientes getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Pacientes idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Doctor getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Doctor idDoctor) {
        this.idDoctor = idDoctor;
    }
    
}
