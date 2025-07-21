/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PitStoreDW.service;

/**
 *
 * @author natia
 */

import com.PitStoreDW.domain.Review;
import java.util.List;

public interface ReviewService {
    void guardar(Review review);
    List<Review> listar();
}