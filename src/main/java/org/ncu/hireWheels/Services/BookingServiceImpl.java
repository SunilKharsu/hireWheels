package org.ncu.hireWheels.Services;

import java.util.Optional;

import org.ncu.hireWheels.Repository.BookingRepository;
import org.ncu.hireWheels.Repository.UserRepository;
import org.ncu.hireWheels.Repository.VehicleRepository;
import org.ncu.hireWheels.entities.User;
import org.ncu.hireWheels.entities.Vehical;
import org.ncu.hireWheels.entities.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	@Override
	public String addBooking(Booking booking) {
		 
		Optional<User> u = userRepository.findById((long) booking.getUser().getUserId());
		Optional<Vehical> v = vehicleRepository.findById(booking.getVehicle().getVehicleId());
		if (u.isPresent() && v.isPresent()) {
			System.out.println("Error in service2");
			if (booking.getPickupDate().compareTo(booking.getDropoffDate()) > 0) {
			    return "Pick up date cannot be greater than drop off date";
			}
			else {
				Booking b = bookingRepository.save(booking);
				if (b== null) 
					return "Failed to book";
				else {
					String msg = updateWalletBalance(booking.getUser().getUserId(), booking.getAmount());
					return msg ;
				}
			}
		}
		else {
			System.out.println("Error in service3");
			return "User or vehicle not found";
		}
	}

	
	public String updateWalletBalance(Long i, double amount) {
		Optional<User> u = userRepository.findById(i);

		if (u.isPresent()) {
			User u_temp = u.get();
			double userBalance = u_temp.getWalletMoney();
			if (userBalance >= amount) {
				u_temp.setWalletMoney(u_temp.getWalletMoney() - amount);
				userRepository.save(u_temp);
				System.out.println("Error in service4");
				return "Booking successfully done. Balance updated successfully";
			}
			else 
				return "Insufficient balance";	
		} else 
			return "User not found";
	}
}


