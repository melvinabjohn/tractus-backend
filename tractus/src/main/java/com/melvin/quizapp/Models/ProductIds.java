package com.melvin.quizapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class ProductIds {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID productId;
}
