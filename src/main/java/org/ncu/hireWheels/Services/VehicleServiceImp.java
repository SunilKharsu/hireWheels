package org.ncu.hireWheels.Services;

import java.time.LocalDateTime;
import java.util.List;

import org.ncu.hireWheels.Repository.VehicleRepository;
import org.ncu.hireWheels.entities.Vehical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImp implements VehicleService{

	
	@Autowired
	VehicleRepository vehicleRepository;
	
	@Override
	public List<Vehical> getVehicles() {
		// TODO Auto-generated method stub
		
		return vehicleRepository.findAll();
	}



//	@Override
//	public List<Vehical> getAvailableVehicles(Long vehicleCategoryId, Long pickupLocationId,
//			LocalDateTime pickupDateTime, LocalDateTime dropOffDateTime) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
}
