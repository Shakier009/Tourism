package za.ac.cput.service.Interests;

import za.ac.cput.domain.Interests.Establishments;
import za.ac.cput.service.IService;

import java.util.Set;

public interface EstablishmentsService extends IService<Establishments, String> {
    Set<Establishments> geetAll();
}
