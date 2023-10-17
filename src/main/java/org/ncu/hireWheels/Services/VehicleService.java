package org.ncu.hireWheels.Services;

import java.time.LocalDateTime;
import java.util.List;

import org.ncu.hireWheels.entities.Vehical;

public interface VehicleService {

	List<Vehical> getVehicles();
	
//	List<Vehical> getAvailableVehicles(
//            Long vehicleCategoryId,
//            Long pickupLocationId,
//            LocalDateTime pickupDateTime,
//            LocalDateTime dropOffDateTime
//    );
	}
