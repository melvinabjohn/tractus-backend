package com.melvin.quizapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ContractDefinition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    String Type;
    Long accessPolicyId;
    Long contractPolicyId;
    String operandLeft;
    String operator;
    String operandRight;
}
