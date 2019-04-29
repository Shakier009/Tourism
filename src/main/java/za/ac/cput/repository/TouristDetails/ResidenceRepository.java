package za.ac.cput.repository.TouristDetails;

import za.ac.cput.domain.TouristDetails.Residence;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface ResidenceRepository extends IRepository<Residence, String> {
    Set<Residence> getAll();
}
