/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PitStoreDW.service;

import com.PitStoreDW.domain.Usuario;

/**
 *
 * @author bdgam
 */
public interface UsuarioService {
    Usuario findByEmail(String email);
    Usuario saveUsuario(Usuario usuario);
}