package za.ac.cput.service.TourDestination;

import za.ac.cput.domain.TourDestination.Cities;
import za.ac.cput.service.IService;

import java.util.Set;

public interface CitiesService extends IService<Cities, String> {
    Set<Cities> geetAll();
}
