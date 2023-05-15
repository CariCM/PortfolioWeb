/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Portafolio.ccm.Service;

import com.Portafolio.ccm.Entidad.Persona;
import com.Portafolio.ccm.Interface.IPersonaService;
import com.Portafolio.ccm.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author KARINA
 */
@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepossitory;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepossitory.findAll();//To change body of generated methods, choose Tools | Templates.
        return persona;
    }
    

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepossitory.save(persona); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePersona(Long id) {
       ipersonaRepossitory.deleteById(id);  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepossitory.findById(id).orElse(null); //To change body of generated methods, choose Tools | Templates.
        return persona;
    }
    
    
}
