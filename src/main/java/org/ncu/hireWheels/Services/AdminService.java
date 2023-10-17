package org.ncu.hireWheels.Services;

import org.ncu.hireWheels.entities.Vehical;

public interface AdminService {

	public String addVehicles(Vehical vehical);
	public String changeAvailability(Long vehicleId);
}
