package com.melvin.quizapp.Service;

import com.melvin.quizapp.Dao.ContractDefinitionDao;
import com.melvin.quizapp.Dao.PolicyDefinitionDao;
import com.melvin.quizapp.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {
    @Autowired
    PolicyDefinitionDao policyDefinitionDao;
    @Autowired
    ContractDefinitionDao contractDefinitionDao;

    public boolean CreatePolicyDefinitions(PolicyDefinitionRequest request) {

        PolicyDefinition policyDefinition = new PolicyDefinition();
        policyDefinition.setPolicyId(request.getPolicyId());
        policyDefinition.setPolicyName(request.getPolicyName());
        policyDefinition.setAction(request.getAction());
        policyDefinition.setOperator(request.getOperator());
        policyDefinition.setLeftOperand(request.getLeftOperand());
        policyDefinition.setRightOperand(request.getRightOperand());
        policyDefinition.setDescription(request.getDescription());

        policyDefinitionDao.save(policyDefinition);
        return true;
    }

    public boolean CreateContractDefinitions(ContractDefinitionRequest request) {
        ContractDefinition contractDefinition = new ContractDefinition();
        contractDefinition.setContractPolicyId(request.getContractPolicyId());
        contractDefinition.setId(request.getId());
        contractDefinition.setType(request.getType());
        contractDefinition.setOperator(request.getOperator());
        contractDefinition.setAccessPolicyId(request.getAccessPolicyId());
        contractDefinition.setOperandRight(request.getOperandRight());
        contractDefinition.setOperandLeft(request.getOperandLeft());

        contractDefinitionDao.save(contractDefinition);
        return true;
    }

    public boolean CreateContractNegotiations(ContractNegotiationRequest request) {
        return true;
    }
}
