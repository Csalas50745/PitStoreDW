/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PitStoreDW.service.impl;


import com.PitStoreDW.dao.ReviewDao;
import com.PitStoreDW.domain.Review;
import com.PitStoreDW.service.ReviewService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewDao reviewDao;

    @Override
    public void guardar(Review review) {
        reviewDao.save(review);
    }

    @Override
    public List<Review> listar() {
        return reviewDao.findAll();
    }
}
