package org.ncu.hireWheels.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "vehicle")
public class Vehical {
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private Long vehicleId;

    @Column(name = "vehicle_model")
    private String vehicleModel;

    public Vehical() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "vehicle_number")
    private String vehicleNumber;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "vehicle_subcategory_id")
    private VehicleSubcategory subcategory;

    @Column(name = "color")
    private String color;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "location_id")
    private Location location;

    public Vehical(Long vehicleId, String vehicleModel, String vehicleNumber, VehicleSubcategory subcategory,
			String color, Location location, FuelType fuelType, boolean availabilityStatus, String vehicleImageUrl) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleModel = vehicleModel;
		this.vehicleNumber = vehicleNumber;
		this.subcategory = subcategory;
		this.color = color;
		this.location = location;
		this.fuelType = fuelType;
		this.availabilityStatus = availabilityStatus;
		this.vehicleImageUrl = vehicleImageUrl;
	}

	public VehicleSubcategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(VehicleSubcategory subcategory) {
		this.subcategory = subcategory;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public void setAvailabilityStatus(boolean availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fuel_type_id")
    private FuelType fuelType;

    @Column(name = "availability_status")
    private boolean availabilityStatus;

    public Vehical( String vehicleModel, String vehicleNumber, Boolean availabilityStatus,
		String vehicleImageUrl) {
	super();
	this.vehicleModel = vehicleModel;
	this.vehicleNumber = vehicleNumber;
	this.availabilityStatus = availabilityStatus;
	this.vehicleImageUrl = vehicleImageUrl;
}

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Boolean getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(Boolean availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public String getVehicleImageUrl() {
		return vehicleImageUrl;
	}

	public void setVehicleImageUrl(String vehicleImageUrl) {
		this.vehicleImageUrl = vehicleImageUrl;
	}

	@Column(name = "vehicle_image_url")
    private String vehicleImageUrl;
}

//{
//    "vehicleId":102,
//	"vehicleModel":"MS1",
//	"vehicleNumber":"HR34533",
//	"subcategory":{
//        "vehicle_subcategory_id":1
//    },
//	"color": "blue",
//	"location":{
//        "location_id":1
//    },
//	"fuelType":{
//        "fuel_type_id":1
//    },
//    "availabilityStatus":true,
//    "vehicleImageUrl":"www.bluecar.com"
//}
