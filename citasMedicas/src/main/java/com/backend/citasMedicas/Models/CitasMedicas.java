package com.backend.citasMedicas.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Table
@Entity(name="citasmedicas")
public class CitasMedicas implements Serializable {
    @Id
    @Column(name="idCitasMedicas")
    private Integer idCitasMedicas;
    
    @DateTimeFormat
    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="hora")
    private Time hora;
    
    @JsonIgnoreProperties
    @ManyToOne
    @JoinColumn(name="idPaciente")
    private Pacientes pacientes;
    
   
    @ManyToOne
    @JoinColumn(name="idDoctor")
    private Doctor doctor;
    
    
    @ManyToOne
    @JoinColumn(name="idCopago")
    private Copago copago;
    
    //Constructor
    public CitasMedicas(int idCitasMedicas, Date fecha, Time hora, Pacientes pacientes, Doctor doctor, Copago copago) {
        this.idCitasMedicas = idCitasMedicas;
        this.fecha = fecha;
        this.hora = hora;
        this.pacientes = pacientes;
        this.doctor = doctor;
        this.copago = copago;
    }
    

    public CitasMedicas() {
    }
    
    
    //Get and Set
    
    public int getIdCitasMedicas() {
        return idCitasMedicas;
    }

    public void setIdCitasMedicas(int idCitasMedicas) {
        this.idCitasMedicas = idCitasMedicas;
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

    public Copago getCopago() {
        return copago;
    }

    public void setCopago(Copago copago) {
        this.copago = copago;
    }

    

}  
