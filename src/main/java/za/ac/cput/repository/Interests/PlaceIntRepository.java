package za.ac.cput.repository.Interests;

import za.ac.cput.domain.Interests.PlaceInt;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface PlaceIntRepository extends IRepository<PlaceInt, String> {
    Set<PlaceInt> getAll();
}
