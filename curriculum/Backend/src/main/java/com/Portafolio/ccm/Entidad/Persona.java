/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Portafolio.ccm.Entidad;


import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author KARINA
 */
@Entity
public class Persona {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY
    )
    private Long id;
    @NotNull
    @Size(min = 1, max=50,message="no cumple con la longitud")
    private String nombre;
     @NotNull
    @Size(min = 1, max=50,message="no cumple con la longitud")
    private String apellido;
     
      
    @Size(min = 1, max=50,message="no cumple con la longitud")
    private String img;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    
}
