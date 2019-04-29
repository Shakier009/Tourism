package za.ac.cput.repository.TouristDetails;

import za.ac.cput.domain.TouristDetails.Name;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface NameRepository extends IRepository<Name, String> {
    Set<Name> getAll();
}
