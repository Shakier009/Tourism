package za.ac.cput.service.Log_In;

import za.ac.cput.domain.Log_In.Reset;
import za.ac.cput.service.IService;

import java.util.Set;

public interface ResetService extends IService<Reset, String> {
    Set<Reset> geetAll();
}
