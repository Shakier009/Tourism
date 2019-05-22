package za.ac.cput.service.Airline;


import za.ac.cput.domain.Airline.Plane;
import za.ac.cput.service.IService;

import java.util.Set;

public interface PlaneService extends IService<Plane, String> {
    Set<Plane> geetAll();
}
