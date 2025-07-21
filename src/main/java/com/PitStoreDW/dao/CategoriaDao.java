package com.PitStoreDW.dao;

import com.PitStoreDW.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria, Long>{
    
}
