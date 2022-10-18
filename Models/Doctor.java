
package com.backend.citas.Models;

import java.io.Serializable;
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
@Entity(name = "doctor")
public class Doctor implements Serializable {
    @Id 
    @Column(name="idDoctor")
    private int idDoctor;
    @Column(name="NombreDoctor")
    private String nombreDoctor;
    @Column(name="ApellidoDoctor1")
    private String apellidoDoctor1;
    @Column(name="ApellidoDoctor2")
    private String apellidoDoctor2;
    @Column(name="EdadDoctor")
    private String edadDoctor;
    @Column(name="Correo")
    private String correo;
    @Column(name="Telefono")
    private int telefono;
    @Column(name="idEspecializacion")
    private int idEspecializacion;

    public Doctor(int idDoctor, String nombreDoctor, String apellidoDoctor1, String apellidoDoctor2, String edadDoctor, String correo, int telefono, int idEspecializacion) {
        this.idDoctor = idDoctor;
        this.nombreDoctor = nombreDoctor;
        this.apellidoDoctor1 = apellidoDoctor1;
        this.apellidoDoctor2 = apellidoDoctor2;
        this.edadDoctor = edadDoctor;
        this.correo = correo;
        this.telefono = telefono;
        this.idEspecializacion = idEspecializacion;
    }

    public Doctor() {
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getApellidoDoctor1() {
        return apellidoDoctor1;
    }

    public void setApellidoDoctor1(String apellidoDoctor1) {
        this.apellidoDoctor1 = apellidoDoctor1;
    }

    public String getApellidoDoctor2() {
        return apellidoDoctor2;
    }

    public void setApellidoDoctor2(String apellidoDoctor2) {
        this.apellidoDoctor2 = apellidoDoctor2;
    }

    public String getEdadDoctor() {
        return edadDoctor;
    }

    public void setEdadDoctor(String edadDoctor) {
        this.edadDoctor = edadDoctor;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdEspecializacion() {
        return idEspecializacion;
    }

    public void setIdEspecializacion(int idEspecializacion) {
        this.idEspecializacion = idEspecializacion;
    }

    
    }

    
    

   
