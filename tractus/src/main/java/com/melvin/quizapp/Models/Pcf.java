package com.melvin.quizapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Entity
@Data
public class Pcf {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID pcfId;
    private String declaredUnit;
    private double unitaryProductAmount;
    private double productMassPerDeclaredUnit;
    private double exemptedEmissionsPercent;
    private String exemptedEmissionsDescription;
    private boolean extWBCSDPackagingEmissionsIncluded;
    private String boundaryProcessesDescription;
    private String geographyCountrySubdivision;
    private String geographyCountry;
    private String geographyRegionOrSubregion;
    private Instant referencePeriodStart;
    private Instant referencePeriodEnd;


}
