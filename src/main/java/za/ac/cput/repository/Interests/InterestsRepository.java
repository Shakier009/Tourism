package za.ac.cput.repository.Interests;

import za.ac.cput.domain.Interests.Interests;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface InterestsRepository extends IRepository<Interests, String> {
    Set<Interests> getAll();
}
