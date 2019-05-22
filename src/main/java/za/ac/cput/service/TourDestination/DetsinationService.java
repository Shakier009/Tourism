package za.ac.cput.service.TourDestination;

import za.ac.cput.domain.TourDestination.Destination;
import za.ac.cput.service.IService;

import java.util.Set;

public interface DetsinationService extends IService<Destination, String> {
    Set<Destination> geetAll();
}
