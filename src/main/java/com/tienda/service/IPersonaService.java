/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //A continuación vamos a escribir metodos que vamos a realizar pero no vamos a especificar porque esteamos en una interface
    public List<Persona> getAllPersona();//Este metodo devolverá info, y como devolverá varios elementos, todo eso se guardará en una lista ( List<Persona> )
    public Persona getPersonaById (long id);//Este metodo devolverá el id de una persona, para eso le tenemos que pasar un parametro de tipo long que se llama "id"
    
    //los siguientes metodos son void por que no van a devolver ninguna info.
    public void savePersona(Persona persona);// Este metodo lo que hará es guardar una nueva fila con info de una nueva persona
    public void delete (long id);//Este lo que hará es mediante el ID va a buscar ese id en la tabla y eliminara esa persona o esa fila
}
