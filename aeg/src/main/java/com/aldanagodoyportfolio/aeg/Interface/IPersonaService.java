/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aldanagodoyportfolio.aeg.Interface;

import com.aldanagodoyportfolio.aeg.Entity.Persona;
import java.util.List;


/**
 *
 * @author Godoy
 */
public interface IPersonaService {
    //Traer 1 lista personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamo por id
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
