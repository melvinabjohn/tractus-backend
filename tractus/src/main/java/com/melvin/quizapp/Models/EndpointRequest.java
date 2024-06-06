package com.melvin.quizapp.Models;

import lombok.Data;

import java.util.UUID;

@Data
public class EndpointRequest {
    UUID id;
    String type;
    String description;
    String endpointAddress;
    String documentation;
    UUID resourceId;
}
