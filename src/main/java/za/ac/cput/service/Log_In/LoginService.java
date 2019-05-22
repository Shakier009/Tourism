package za.ac.cput.service.Log_In;

import za.ac.cput.domain.Log_In.LogIn;
import za.ac.cput.service.IService;

import java.util.Set;

public interface LoginService extends IService<LogIn, String> {
    Set<LogIn> geetAll();
}
