package za.ac.cput.repository.TourDestination;

import za.ac.cput.domain.TourDestination.Hotels;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface HotelsRepository extends IRepository<Hotels, String> {
    Set<Hotels> getAll();
}
