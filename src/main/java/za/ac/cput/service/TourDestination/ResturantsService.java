package za.ac.cput.service.TourDestination;

import za.ac.cput.domain.TourDestination.Resturants;
import za.ac.cput.service.IService;

import java.util.Set;

public interface ResturantsService extends IService<Resturants, String> {
    Set<Resturants> geetAll();
}
