package org.ncu.hireWheels.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "vehicle_category")
public class VehicleCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_category_id")
    private Long vehicleCategoryId;

    public Long getVehicleCategoryId() {
		return vehicleCategoryId;
	}

	public void setVehicleCategoryId(Long vehicleCategoryId) {
		this.vehicleCategoryId = vehicleCategoryId;
	}

	public String getVehicleCategoryName() {
		return vehicleCategoryName;
	}

	public void setVehicleCategoryName(String vehicleCategoryName) {
		this.vehicleCategoryName = vehicleCategoryName;
	}

	public VehicleCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleCategory(Long vehicleCategoryId, String vehicleCategoryName) {
		super();
		this.vehicleCategoryId = vehicleCategoryId;
		this.vehicleCategoryName = vehicleCategoryName;
	}

	@Column(name = "vehicle_category_name", unique = true)
    private String vehicleCategoryName;
}

