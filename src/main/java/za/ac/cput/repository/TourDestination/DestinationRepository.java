package za.ac.cput.repository.TourDestination;

import za.ac.cput.domain.TourDestination.Destination;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface DestinationRepository extends IRepository<Destination, String> {
    Set<Destination> getAll();
}
