package org.ncu.hireWheels.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicle_subcategory")
public class VehicleSubcategory {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long vehicleSubcategoryId;

	    @Column(nullable = false, unique = true, length = 50)
	    private String vehicleSubcategoryName;

	    @Column(nullable = false, precision = 10, scale = 2)
	    private double pricePerDay;

	    @ManyToOne
	    @JoinColumn(name = "vehicle_category_id", nullable = false)
	    private VehicleCategory vehicleCategory;

		public VehicleSubcategory() {
			super();
			// TODO Auto-generated constructor stub
		}

}
