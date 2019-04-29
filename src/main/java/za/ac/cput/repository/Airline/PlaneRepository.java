package za.ac.cput.repository.Airline;

import za.ac.cput.domain.Airline.Plane;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface PlaneRepository extends IRepository<Plane, String>{
    Set<Plane> getAll();
}
