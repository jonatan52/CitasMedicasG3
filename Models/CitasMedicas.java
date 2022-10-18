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
@Entity(name = "citasmedicas")
public class CitasMedicas implements Serializable {

    @Id
    @Column(name = "idCitasMedicas")
    private int idCitasMedicas;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "hora")
    private Time hora;
    @ManyToOne
    @JoinColumn(name = "idPaciente")
    private Pacientes idPaciente;
    @ManyToOne
    @JoinColumn(name = "idDoctor")
    private Doctor idDoctor;
    @ManyToOne
    @JoinColumn(name = "idCopago")
    private Copago idCopago;

    public CitasMedicas(int idCitasMedicas, Date fecha, Time hora, Pacientes idPaciente, Doctor idDoctor, Copago idCopago) {
        this.idCitasMedicas = idCitasMedicas;
        this.fecha = fecha;
        this.hora = hora;
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
        this.idCopago = idCopago;
    }

    

    public CitasMedicas() {
    }

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

    public Copago getIdCopago() {
        return idCopago;
    }

    public void setIdCopago(Copago idCopago) {
        this.idCopago = idCopago;
    }

   
}
    
