package org.ncu.hireWheels.Controller;

import org.ncu.hireWheels.Services.AdminService;
import org.ncu.hireWheels.entities.Vehical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.sym.Name;

@RestController
@RequestMapping(path="/hirewheels/v1")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/addVehicle")
	public String addVehicle(@RequestBody Vehical vehical) {
		//Vehical v1 = new Vehical( "2020", "HR 20 ", true, "https://vehicleUrl");
		
		String mssgString = adminService.addVehicles(vehical);
		return mssgString;
	}
	
	@PutMapping("/vehicle/{id}")
	public String UpdateVehicle(@PathVariable (name = "id")Long id) {
		String msgString = adminService.changeAvailability(id);
		return msgString;
	}

}


