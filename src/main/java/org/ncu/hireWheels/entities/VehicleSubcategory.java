package org.ncu.hireWheels.entities;

import java.math.BigDecimal;

import jakarta.persistence.*;
@Entity
@Table(name = "vehicle_subcategory")
public class VehicleSubcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_subcategory_id")
    private Long vehicleSubcategoryId;

    @Column(name = "vehicle_subcategory_name", unique = true)
    private String vehicleSubcategoryName;

    @Column(name = "price_per_day")
    private BigDecimal pricePerDay;

    public VehicleSubcategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleSubcategory(Long vehicleSubcategoryId, String vehicleSubcategoryName, BigDecimal pricePerDay,
			VehicleCategory category) {
		super();
		this.vehicleSubcategoryId = vehicleSubcategoryId;
		this.vehicleSubcategoryName = vehicleSubcategoryName;
		this.pricePerDay = pricePerDay;
		this.category = category;
	}

	public Long getVehicleSubcategoryId() {
		return vehicleSubcategoryId;
	}

	public void setVehicleSubcategoryId(Long vehicleSubcategoryId) {
		this.vehicleSubcategoryId = vehicleSubcategoryId;
	}

	public String getVehicleSubcategoryName() {
		return vehicleSubcategoryName;
	}

	public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
		this.vehicleSubcategoryName = vehicleSubcategoryName;
	}

	public BigDecimal getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(BigDecimal pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public VehicleCategory getCategory() {
		return category;
	}

	public void setCategory(VehicleCategory category) {
		this.category = category;
	}

	@ManyToOne
    @JoinColumn(name = "vehicle_category_id")
    private VehicleCategory category;
	
	
}
