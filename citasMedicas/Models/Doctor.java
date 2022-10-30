package com.backend.citasMedicas.Models;

import java.io.Serializable;
import java.util.List;
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
@Entity(name="doctor")
public class Doctor implements Serializable {

    @Id
    @Column(name = "idDoctor")
    private int idDoctor;

    @Column(name = "nombreDoctor")
    private String nombreDoctor;

    @Column(name = "apellidoDoctor1")
    private String apellidoDoctor1;

    @Column(name = "apellidoDoctor2")
    private String apellidoDoctor2;

    @Column(name = "edadDoctor")
    private  Integer edadDoctor;

    @Column(name = "correo")
    private String correo;

    
    @Column(name = "idEspecializacion")
    private String idEspecializacion;

    @Column(name = "telefono")
    private int telefono;

    //Constructor

    public Doctor(int idDoctor, String nombreDoctor, String apellidoDoctor1, String apellidoDoctor2, Integer edadDoctor, String correo, String idEspecializacion, int telefono) {
        this.idDoctor = idDoctor;
        this.nombreDoctor = nombreDoctor;
        this.apellidoDoctor1 = apellidoDoctor1;
        this.apellidoDoctor2 = apellidoDoctor2;
        this.edadDoctor = edadDoctor;
        this.correo = correo;
        this.idEspecializacion = idEspecializacion;
        this.telefono = telefono;
    }

    public Doctor() {
    }

    // Get and Set

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

    public Integer getEdadDoctor() {
        return edadDoctor;
    }

    public void setEdadDoctor(Integer edadDoctor) {
        this.edadDoctor = edadDoctor;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdEspecializacion() {
        return idEspecializacion;
    }

    public void setIdEspecializacion(String idEspecializacion) {
        this.idEspecializacion = idEspecializacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

   
    
}
