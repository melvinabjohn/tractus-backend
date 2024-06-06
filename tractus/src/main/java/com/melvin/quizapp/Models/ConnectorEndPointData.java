package com.melvin.quizapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class ConnectorEndPointData {

    @Id
    String Bpn;
    List<String> ConnectorEndpoint;
}
