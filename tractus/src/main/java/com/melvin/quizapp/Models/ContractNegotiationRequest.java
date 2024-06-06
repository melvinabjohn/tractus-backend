package com.melvin.quizapp.Models;

import lombok.Data;

@Data
public class ContractNegotiationRequest {

    Long ConnectorId;
    Long ProviderId;
    String OfferId;
    String AssetId;
    String Protocol;
    String leftOperand;
    String rightOperand;
    String operator;
    String Target;
}
