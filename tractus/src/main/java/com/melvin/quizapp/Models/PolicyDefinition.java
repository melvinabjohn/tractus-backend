package com.melvin.quizapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PolicyDefinition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long PolicyId;
    String PolicyName;
    String Description;
    String action;
    String leftOperand;
    String rightOperand;
    String operator;
}
