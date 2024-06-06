package com.melvin.quizapp.Models;

import lombok.Data;

import java.util.UUID;

@Data
public class SearchRequest {

    UUID id;
    String type;
    UUID resourceId;
}
