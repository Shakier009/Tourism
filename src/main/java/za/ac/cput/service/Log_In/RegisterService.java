package za.ac.cput.service.Log_In;

import za.ac.cput.domain.Log_In.Register;
import za.ac.cput.service.IService;

import java.util.Set;

public interface RegisterService extends IService<Register, String> {
    Set<Register> geetAll();
}
