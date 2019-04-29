package za.ac.cput.repository.TourDestination;

import za.ac.cput.domain.TourDestination.Resturants;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface ResturantsRepository extends IRepository<Resturants, String> {
    Set<Resturants> getAll();
}
