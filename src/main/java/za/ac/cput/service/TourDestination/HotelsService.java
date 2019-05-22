package za.ac.cput.service.TourDestination;

import za.ac.cput.domain.TourDestination.Hotels;
import za.ac.cput.service.IService;

import java.util.Set;

public interface HotelsService extends IService<Hotels, String> {
    Set<Hotels> geetAll();
}
