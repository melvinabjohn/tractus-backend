package com.melvin.quizapp.Dao;

import com.melvin.quizapp.Models.PolicyDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyDefinitionDao extends JpaRepository<PolicyDefinition, Long> {
}
