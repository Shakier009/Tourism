package za.ac.cput.repository.TouristDetails;

import za.ac.cput.domain.TouristDetails.Gender;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender, String> {
    Set<Gender> getAll();
}
