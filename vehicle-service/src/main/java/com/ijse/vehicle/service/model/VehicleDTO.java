package com.ijse.vehicle_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDTO {
    private Long vehicleId;
    private String registrationNumber;
    private String ownerName;
    private String manufacturer;
    private String model;
    private Integer manufactureYear;
    private String userId;
}
