package za.ac.cput.repository.TouristDetails;

import za.ac.cput.domain.TouristDetails.TouristType;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface TouristTypeRepository extends IRepository<TouristType, String> {
    Set<TouristType> getAll();
}
