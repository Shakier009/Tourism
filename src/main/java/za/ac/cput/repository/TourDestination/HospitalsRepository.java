package za.ac.cput.repository.TourDestination;

import za.ac.cput.domain.TourDestination.Hospitals;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface HospitalsRepository extends IRepository<Hospitals, String> {
    Set<Hospitals> getAll();
}
