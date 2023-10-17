package org.ncu.hireWheels.entities;

 
import jakarta.persistence.*;
@Entity
@Table(name = "city")
public class City {
    public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Long cityId;

    @Column(name = "city_name")
    private String cityName;
}
