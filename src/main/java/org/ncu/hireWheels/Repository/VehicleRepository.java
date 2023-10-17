package org.ncu.hireWheels.Repository;

import org.ncu.hireWheels.entities.Vehical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehical, Long> {

}
