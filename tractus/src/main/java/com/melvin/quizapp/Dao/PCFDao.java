package com.melvin.quizapp.Dao;

import com.melvin.quizapp.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PCFDao extends JpaRepository<Product, Integer> {

}
