package com.backend.citasMedicas.Models;

import java.io.Serializable;
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
@Entity(name="especialidad")
public class Especialidad implements Serializable {
    @Id
    @Column(name="idEspecializacion")
    private int idEspecializacion;
    
    @Column(name="nombreEspecializacion")
    private String nombreEspecializacion;
    
    //Constructor
    public Especialidad(int idEspecializacion, String nombreEspecializacion) {
        this.idEspecializacion = idEspecializacion;
        this.nombreEspecializacion = nombreEspecializacion;
    }

    public Especialidad() {
    }
    
    //Get and Set

    public int getIdEspecializacion() {
        return idEspecializacion;
    }

    public void setIdEspecializacion(int idEspecializacion) {
        this.idEspecializacion = idEspecializacion;
    }

    public String getNombreEspecializacion() {
        return nombreEspecializacion;
    }

    public void setNombreEspecializacion(String nombreEspecializacion) {
        this.nombreEspecializacion = nombreEspecializacion;
    }
    
    

}