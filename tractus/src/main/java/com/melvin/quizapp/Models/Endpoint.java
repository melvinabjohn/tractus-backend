package com.melvin.quizapp.Models;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.Id;

import java.util.UUID;

@Data
@Entity
public class Endpoint {

    @Id
    UUID id;
    String type;
    String description;
    String endpointAddress;
    String documentation;
    UUID resourceId;
}
