package com.melvin.quizapp.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private int version;
    private Instant created;
    private String comment;
    private String pcfLegalStatement;
    private String companyName;

    @OneToOne(cascade = CascadeType.ALL)
    private CompanyIds companyIds;

    private String productDescription;

    @OneToOne(cascade = CascadeType.ALL)
    private ProductIds productIds;

    private String extWBCSDProductCodeCpc;
    private String productName;

    @OneToOne(cascade = CascadeType.ALL)
    private Pcf pcf;

}
