/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.repository;

import com.tienda.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository //definimos que esta clase va a ser un repositorio
public interface PersonaRepository extends CrudRepository<Persona,Long>{//El crudRepository lo que va a permitir es la creación, lectura y actualización me imagino que en este repositorio
    
}
