package com.melvin.quizapp.Models;

import lombok.Data;

import java.util.List;

@Data
public class CatalogRequest {
    String type;
    String providerUrl;
    String protocol;
    QuerySpec querySpec;
}

