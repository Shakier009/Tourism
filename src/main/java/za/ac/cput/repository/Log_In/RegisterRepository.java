package za.ac.cput.repository.Log_In;

import za.ac.cput.domain.Log_In.Register;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface RegisterRepository extends IRepository<Register, String> {
    Set<Register> getAll();
}
