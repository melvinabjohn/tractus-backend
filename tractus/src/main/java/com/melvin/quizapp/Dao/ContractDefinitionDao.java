package com.melvin.quizapp.Dao;

import com.melvin.quizapp.Models.ContractDefinition;
import com.melvin.quizapp.Models.PolicyDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractDefinitionDao extends JpaRepository<ContractDefinition, Long> {
}
