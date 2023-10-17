package org.ncu.hireWheels.entities;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
    public Booking(int bookingId, Date pickupDate, Date dropoffDate, Date bookingDate, long amount,
			Location location, Vehical vehicle, User user) {
		super();
		this.bookingId = bookingId;
		this.pickupDate = pickupDate;
		this.dropoffDate = dropoffDate;
		this.bookingDate = bookingDate;
		this.amount = amount;
		this.location = location;
		this.vehicle = vehicle;
		this.user = user;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Vehical getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehical vehicle) {
		this.vehicle = vehicle;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int bookingId;

    @Column(name = "pickup_date", nullable = false)
    private Date pickupDate;

   
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", pickupDate=" + pickupDate + ", dropoffDate=" + dropoffDate
				+ ", bookingDate=" + bookingDate + ", amount=" + amount + ", location=" + location + ", vehicle="
				+ vehicle + ", user=" + user + "]";
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public Date getDropoffDate() {
		return dropoffDate;
	}

	public void setDropoffDate(Date dropoffDate) {
		this.dropoffDate = dropoffDate;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Column(name = "dropoff_date", nullable = false)
    private Date dropoffDate;

    @Column(name = "booking_date", nullable = false)
    private Date bookingDate;

    @Column(name = "amount", nullable = false)
    private long amount;

    public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "vehicle_id")
    private Vehical vehicle;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User user;
}

//{
//    "bookingId":101,
//	"pickupDate":"2023-11-10",
//	"dropoffDate":"2023-11-15",
//	"bookingDate":"2023-11-16",
//	"amount": 2000,
//	"location":{
//        "location_id":1
//    },
//	"vehicle":{
//        "locaiton_id":1
//    },
//	"user":{
//        "user_id":1
//    }
//}
//
