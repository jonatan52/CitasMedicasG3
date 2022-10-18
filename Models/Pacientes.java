
package com.backend.citas.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Table
@Entity(name = "pacientes")
public class Pacientes implements Serializable {
    @Id 
    @Column(name="idPaciente")
    private int idPaciente;
    @Column(name="NombrePaciente")
    private String nombrePaciente;
    @Column(name="ApellidoPaciente1")
    private String apellidoPaciente1;
    @Column(name="ApellidoPaciente2")
    private String apellidoPaciente2;
    @Column(name="EdadPaciente")
    private String edadPaciente;
    @Column(name="Genero")
    private int genero;
    @Column(name="Telefono")
    private int telefono;
    @Column(name="Direccion")
    private int direccion;
    @Column(name="Correo")
    private String correo;
    @Column(name="Eps")
    private int eps;

    public Pacientes(int idPaciente, String nombrePaciente, String apellidoPaciente1, String apellidoPaciente2, String edadPaciente, int genero, int telefono, int direccion, String correo, int eps) {
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente1 = apellidoPaciente1;
        this.apellidoPaciente2 = apellidoPaciente2;
        this.edadPaciente = edadPaciente;
        this.genero = genero;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.eps = eps;
    }

    public Pacientes() {
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
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

    public String getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(String edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEps() {
        return eps;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }
    
}



    

