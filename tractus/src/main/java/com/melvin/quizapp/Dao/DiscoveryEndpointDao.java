package com.melvin.quizapp.Dao;

import com.melvin.quizapp.Models.Endpoint;
import com.melvin.quizapp.Models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DiscoveryEndpointDao extends JpaRepository<Endpoint, UUID> {

    List<Endpoint> findByType(String type);
    List<Endpoint> findByResourceId(UUID resourceId);
}
