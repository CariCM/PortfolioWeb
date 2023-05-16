/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Portafolio.ccm.Security.Entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.UserDetails;


/**
 *
 * @author KARINA
 */
public class UsuarioPrincipal implements UserDetails {
   private String nombre;
   private String nombreUsuario;
   private String email;
   private String password;
   private Collection<? extends GrantedAuthority> authorities;

    public UsuarioPrincipal(String nombre, String nombreUsuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
    
   
   public static UsuarioPrincipal build(Usuario usuario){
       List<GrantedAuthority> authorities=usuario.getRoles().stream().map(rol-> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collector.toList());
       return new UsuarioPrincipal(usuario.getNombre(),usuario.getNombreUsuario(),usuario.getEmail(),usuario.getPassword(),authorities);
   }

   
   
   
}
