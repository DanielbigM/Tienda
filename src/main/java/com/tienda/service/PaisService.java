/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Pais;
import com.tienda.repository.PaisRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service//ACUERDESE DE DECLARAR LO QUE CADA CLASE ES!!!! POR FAVOR!
public class PaisService implements IPaisService{
    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> listcountry() {
        return (List<Pais>)paisRepository.findAll();
    }

}
