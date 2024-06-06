package com.melvin.quizapp.Dao;

import com.melvin.quizapp.Models.ConnectorEndPointData;
import com.melvin.quizapp.Models.Endpoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ConnectorEndPointDao extends JpaRepository<ConnectorEndPointData, String> {


}
