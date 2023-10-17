package org.ncu.hireWheels.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "fuel_type")
public class FuelType {
    public FuelType() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fuel_type_id")
    private Long fuelTypeId;

    @Column(name = "fuel_type", unique = true)
    private String fuelType;
}
