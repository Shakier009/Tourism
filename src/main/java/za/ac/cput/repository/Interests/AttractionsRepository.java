package za.ac.cput.repository.Interests;

import za.ac.cput.domain.Interests.Attractions;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface AttractionsRepository extends IRepository<Attractions, String> {
    Set<Attractions> getAll();
}
