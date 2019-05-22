package za.ac.cput.service.Interests;

import za.ac.cput.domain.Interests.Attractions;
import za.ac.cput.service.IService;

import java.util.Set;

public interface AttractionsService extends IService<Attractions, String> {
        Set<Attractions> geetAll();
}
