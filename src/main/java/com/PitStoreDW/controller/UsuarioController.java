/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PitStoreDW.controller;

import com.PitStoreDW.domain.Usuario;
import com.PitStoreDW.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author bdgam
 */
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registro")
    public ResponseEntity<String> registrarUsuario(@RequestBody Usuario usuario) {
        Usuario usuarioExistente = usuarioService.findByEmail(usuario.getEmail());
        if (usuarioExistente != null) {
            return ResponseEntity.badRequest().body("El correo ya está registrado.");
        }
        usuarioService.saveUsuario(usuario);
        return ResponseEntity.ok("Usuario registrado exitosamente.");
    }

    @PostMapping("/login")
    public ResponseEntity<String> iniciarSesion(@RequestBody Usuario usuario) {
        Usuario usuarioExistente = usuarioService.findByEmail(usuario.getEmail());
        if (usuarioExistente == null || !usuarioExistente.getPassword().equals(usuario.getPassword())) {
            return ResponseEntity.badRequest().body("Credenciales incorrectas.");
        }
        return ResponseEntity.ok("Inicio de sesión exitoso.");
    }
}
