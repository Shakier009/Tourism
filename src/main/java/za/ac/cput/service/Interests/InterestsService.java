package za.ac.cput.service.Interests;

import za.ac.cput.domain.Interests.Interests;
import za.ac.cput.service.IService;

import java.util.Set;

public interface InterestsService extends IService<Interests, String> {
    Set<Interests> geetAll();
}
