package za.ac.cput.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.repository.IRepository;

import java.util.Set;
@Repository
public interface BookingRepository extends CrudRepository<Booking, Long> {
    //Set<Booking> getAll();
}
//JpaRepository