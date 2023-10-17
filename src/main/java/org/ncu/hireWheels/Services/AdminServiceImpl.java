package org.ncu.hireWheels.Services;

import java.util.Optional;

import org.ncu.hireWheels.Repository.AdminRepository;
import org.ncu.hireWheels.Repository.VehicleRepository;
import org.ncu.hireWheels.entities.Vehical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public String addVehicles(Vehical vehical) {
		// TODO Auto-generated method stub
		Vehical v1 = adminRepository.save(vehical);
		
		if(v1 != null)
			return "Add successfully";
		else {
			return "error";
		}
	}
	
	@Override
	public String changeAvailability(Long vehicleId) {
		
	Optional<Vehical> v	= vehicleRepository.findById(vehicleId);
	
	if(v.isPresent()) {
		Vehical vehicle = v.get();
		if(vehicle.getAvailabilityStatus() == true) {
			vehicle.setAvailabilityStatus(false);
			vehicleRepository.save(vehicle);
			return "vehicle status updated successfully";
		}
		else {
			vehicle.setAvailabilityStatus(false);
			vehicleRepository.save(vehicle);
			return "vehicle status updated successfully";

		}
	}else {
		return "vehcicle does not exists";
	}
		
	}

}
