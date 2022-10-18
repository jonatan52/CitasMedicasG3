
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
@Entity(name = "copago")
public class Copago implements Serializable {
    @Id 
    @Column(name="idCopago")
    private int idCopago;
    @Column(name="precio")
    private int precio;

    public Copago(int idCopago, int precio) {
        this.idCopago = idCopago;
        this.precio = precio;
    }

    public Copago() {
    }

    public int getIdCopago() {
        return idCopago;
    }

    public void setIdCopago(int idCopago) {
        this.idCopago = idCopago;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    }

        

       