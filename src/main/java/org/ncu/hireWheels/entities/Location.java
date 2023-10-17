package org.ncu.hireWheels.entities;



import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "location_name")
    private String locationName;

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public Location(Long locationId, String locationName, String address, City city, String pincode) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "pincode")
    private String pincode;
}