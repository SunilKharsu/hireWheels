package org.ncu.hireWheels.Controller;

import java.util.List;

import org.ncu.hireWheels.Services.VehicleService;
import org.ncu.hireWheels.entities.Vehical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;

	@GetMapping("/getVehicles")
	List<Vehical> getVehicals(){
		return vehicleService.getVehicles();
	}
	
}
