package pl.damrob.votas.rest;

import lombok.Data;

@Data
class Report {
    private String id;
    private String description;
    private String distanceDriven;
    private String fuelConsumed;
}