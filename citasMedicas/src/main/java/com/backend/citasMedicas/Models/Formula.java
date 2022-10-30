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
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Table
@Entity(name="formula")
public class Formula implements Serializable {
    @Id
    @JoinColumn(name="idFormula")
    private Integer detalleformula;
    
    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="hora")
    private Time hora;
    
    @ManyToOne
    @JoinColumn(name="idPaciente")
    private Pacientes pacientes;
    
    @ManyToOne
    @JoinColumn(name="idDoctor")
    private Doctor doctor ;
    
    //Constructor

    public Formula(Integer detalleformula, Date fecha, Time hora, Pacientes pacientes, Doctor doctor) {
        this.detalleformula = detalleformula;
        this.fecha = fecha;
        this.hora = hora;
        this.pacientes = pacientes;
        this.doctor = doctor;
    }

    

    

    public Formula() {
    }
    
    //Get and Set

    public Integer getDetalleformula() {
        return detalleformula;
    }

    public void setDetalleformula(Integer detalleformula) {
        this.detalleformula = detalleformula;
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

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    
    
}  
    

