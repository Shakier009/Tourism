package za.ac.cput.repository.TourDestination;

import za.ac.cput.domain.TourDestination.TourDest;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface TourDestRepository extends IRepository<TourDest, String> {
    Set<TourDest> getAll();
}
