package za.ac.cput.repository.Log_In;

import za.ac.cput.domain.Log_In.LogIn;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface LogInRepository extends IRepository<LogIn, String> {
    Set<LogIn> getAll();
}
