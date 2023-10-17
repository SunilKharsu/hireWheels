package org.ncu.hireWheels.Controller;

import org.ncu.hireWheels.Services.BookingService;
import org.ncu.hireWheels.entities.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/hirewheels/v1")
public class BookingController {
	
	@Autowired
	 BookingService bookingService;
	@PostMapping(path="/bookings")
	public String addBooking(@RequestBody Booking booking) {
		System.out.println("Error in controller1");
		String msgString = bookingService.addBooking(booking);
		System.out.println("Error in controller2");
		return msgString;
		
	}

}
