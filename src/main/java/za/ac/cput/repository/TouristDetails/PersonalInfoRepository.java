package za.ac.cput.repository.TouristDetails;

import za.ac.cput.domain.TouristDetails.PersonalInfo;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface PersonalInfoRepository extends IRepository<PersonalInfo, String> {
    Set<PersonalInfo> getAll();
}
