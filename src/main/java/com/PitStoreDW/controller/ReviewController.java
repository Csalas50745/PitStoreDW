/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PitStoreDW.controller;

import com.PitStoreDW.domain.Review;
import com.PitStoreDW.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ReviewController {

    @GetMapping("/clientes")
    public String mostrarFormulario() {
          System.out.println("🟢 Entrando a /clientes");
        return "clientes";
    }

    @PostMapping("/clientes/opinion")
    public String recibirComentario(@RequestParam("comentario") String comentario, Model model) {
        // Aquí podrías guardar si quisieras, pero ahora solo mostramos el mensaje
        model.addAttribute("mensaje", "¡Tu opinión es válida para nosotros!");
        return "clientes";
    }
}
