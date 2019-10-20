//package za.ac.cput.repository.impl.Airline;
//
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import za.ac.cput.domain.Airline.Airline;
//import za.ac.cput.repository.Airline.AirlineRepository;
//import java.util.Set;
//
//import static org.junit.Assert.*;
//
//public class FlightDetailsRepositoryImplTest {
//
//
//    private AirlineRepository repository;
//    @Before
//    public void setUp() throws Exception {
//
//        this.repository = AirlineRepositoryImpl.getRepository();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//
//    @Test
//    public void getRepository() {
//    }
//
//    @Test
//    public void create() {
//
//        this.repository.create(null);
//        Assert.assertEquals(null, null);
//    }
//
//    @Test
//    public void read() {
//    }
//
//    @Test
//    public void update() {
//    }
//
//    @Test
//    public void delete() {
//    }
//
//    @Test
//    public void getAll() {
//        Set<Airline> airplane = this.repository.getAll();
//        Assert.assertEquals(1, airplane.size());
//    }
//}