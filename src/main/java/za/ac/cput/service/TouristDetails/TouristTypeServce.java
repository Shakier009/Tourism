package za.ac.cput.service.TouristDetails;

import za.ac.cput.domain.TouristDetails.TouristType;
import za.ac.cput.service.IService;

import java.util.Set;

public interface TouristTypeServce extends IService<TouristType, String> {
    Set<TouristType> geetAll();
}
