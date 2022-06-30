/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Persona;
import com.tienda.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//Declaramos que esta clase va a ser un servicio
public class PersonaService implements IPersonaService{//Es necesario implementar a la interface PersonaService para tener acceso a los metodos que estan ahí

    @Autowired //Hacemos una Inyección de independencias
    private PersonaRepository personaRepository;//Creamos una variable de tipo PersonaRepository para poder tener acceso al repositorio y a sus metodos 
    
    @Override
    public List<Persona> getAllPersona() {
        return (List<Persona>)personaRepository.findAll();
    }

    @Override
    public Persona getPersonaById(long id) {//Parametro
        return personaRepository.findById(id).orElse(null);//argumento
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
    }
    
}
