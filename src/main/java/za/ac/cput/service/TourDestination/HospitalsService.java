package za.ac.cput.service.TourDestination;
import za.ac.cput.domain.TourDestination.Hospitals;
import za.ac.cput.service.IService;

import java.util.Set;

public interface HospitalsService extends IService<Hospitals, String> {
    Set<Hospitals> geetAll();
}
