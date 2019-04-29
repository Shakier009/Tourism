package za.ac.cput.repository.TourDestination;

import za.ac.cput.domain.TourDestination.Cities;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface CitiesRepository extends IRepository<Cities, String> {
    Set<Cities> getAll();
}
