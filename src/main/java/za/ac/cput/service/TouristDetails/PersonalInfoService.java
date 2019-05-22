package za.ac.cput.service.TouristDetails;

import za.ac.cput.domain.TouristDetails.PersonalInfo;
import za.ac.cput.service.IService;

import java.util.Set;

public interface PersonalInfoService extends IService<PersonalInfo, String> {
    Set<PersonalInfo> geetAll();
}
