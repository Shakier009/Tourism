package za.ac.cput.repository.Log_In;

import za.ac.cput.domain.Log_In.Reset;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface ResetRepository extends IRepository<Reset, String> {
    Set<Reset> getAll();
}
