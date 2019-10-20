//package za.ac.cput.repository.impl.TourDestination;
//
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import za.ac.cput.domain.TourDestination.TourDest;
//import za.ac.cput.repository.TourDestination.TourDestRepository;
//
//import java.util.Set;
//
//import static org.junit.Assert.*;
//
//public class TourDestRepositoryImplTest {
//
//    private TourDestRepository repository;
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = TourDestRepositoryImpl.getRepository();
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
//        Set<TourDest> tourDest = this.repository.getAll();
//        Assert.assertEquals(1, tourDest.size());
//    }
//}