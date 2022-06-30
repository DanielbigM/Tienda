/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Margarita E
 */
@Entity//Aquí lo que estamos haciendo es declarar que esta clase sea una entidad! (Esto es mediante Spring boot)
@Table(name="personas")//Como queremos modelar la info de una TABLA, más, el nombre de la tabla, acuerdese que hay que especificar!
public class Persona implements Serializable{//Implementamos a serialisable que nos permitira convertir objetos en bytes para enviarlo por una red y viceversa
    @Id //Estamos implementando el Primary Key
    @GeneratedValue(strategy= GenerationType.IDENTITY)//Esta linea de codigo indica como queremos que nuestro ID se comporte, en este caso que sea auto incremental
    private long id;//Aquí se guardara varas que esten el el primary key, cuando se traigan de la base de datos
    //Estos atributos servirán para almacenar las cosas de la base de datos 
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "paises_id")
    private Pais pais;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
}
