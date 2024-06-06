package com.melvin.quizapp.Models;

import lombok.Data;

@Data
public class ContractDefinitionRequest {

    String Type;
    Long Id;
    Long accessPolicyId;
    Long contractPolicyId;
    String operandLeft;
    String operator;
    String operandRight;
}

