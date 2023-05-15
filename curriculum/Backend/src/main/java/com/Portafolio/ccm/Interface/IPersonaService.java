/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Portafolio.ccm.Interface;

import com.Portafolio.ccm.Entidad.Persona;
import java.util.List;

/**
 *
 * @author KARINA
 */
public interface IPersonaService {
    //traer una lista de persona
    public List<Persona>getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
   //eliminar usuario
    public void deletePersona(Long id);
    
    //buscar persona por id
    
    public Persona findPersona(Long id);
    
}
