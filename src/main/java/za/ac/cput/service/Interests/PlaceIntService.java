package za.ac.cput.service.Interests;

import za.ac.cput.domain.Interests.PlaceInt;
import za.ac.cput.service.IService;

import java.util.Set;

public interface PlaceIntService extends IService<PlaceInt, String> {
    Set<PlaceInt> geetAll();
}
