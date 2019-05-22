package za.ac.cput.service.TourDestination;

import za.ac.cput.domain.TourDestination.TourDest;
import za.ac.cput.service.IService;

import java.util.Set;

public interface TourDestService extends IService<TourDest, String> {
    Set<TourDest> geetAll();
}
