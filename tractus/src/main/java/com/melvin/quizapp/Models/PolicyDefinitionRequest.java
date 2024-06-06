package com.melvin.quizapp.Models;

import lombok.Data;

@Data
public class PolicyDefinitionRequest {

    Long PolicyId;
    String PolicyName;
    String Description;
    String action;
    String leftOperand;
    String rightOperand;
    String operator;
}
