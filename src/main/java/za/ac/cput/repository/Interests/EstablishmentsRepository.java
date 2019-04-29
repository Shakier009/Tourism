package za.ac.cput.repository.Interests;

import za.ac.cput.domain.Interests.Establishments;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface EstablishmentsRepository extends IRepository<Establishments, String> {
    Set<Establishments> getAll();
}
