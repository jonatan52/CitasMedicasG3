package com.backend.citasMedicas.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Table
@Entity(name = "pacientes")
public class Pacientes implements Serializable {

    @Id
    @Column(name = "idPaciente")
    private Integer idPaciente;

    @Column(name = "nombrePaciente")
    private String nombrePaciente;

    @Column(name = "apellidoPaciente1")
    private String apellidoPaciente1;

    @Column(name = "apellidoPaciente2")
    private String apellidoPaciente2;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "genero")
    private String genero;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "correo")
    private String correo;

    @Column(name = "eps")
    private String eps;

//Constructor

    public Pacientes(Integer idPaciente, String nombrePaciente, String apellidoPaciente1, String apellidoPaciente2, Integer edad, String genero, String telefono, String direccion, String correo, String eps) {
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente1 = apellidoPaciente1;
        this.apellidoPaciente2 = apellidoPaciente2;
        this.edad = edad;
        this.genero = genero;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.eps = eps;
    }

    public Pacientes() {
    }

   //Get and set

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente1() {
        return apellidoPaciente1;
    }

    public void setApellidoPaciente1(String apellidoPaciente1) {
        this.apellidoPaciente1 = apellidoPaciente1;
    }

    public String getApellidoPaciente2() {
        return apellidoPaciente2;
    }

    public void setApellidoPaciente2(String apellidoPaciente2) {
        this.apellidoPaciente2 = apellidoPaciente2;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }
    
    
}
