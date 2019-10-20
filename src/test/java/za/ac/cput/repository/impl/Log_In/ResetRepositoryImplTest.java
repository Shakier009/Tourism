//package za.ac.cput.repository.impl.Log_In;
//
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import za.ac.cput.domain.Log_In.Reset;
//import za.ac.cput.repository.Log_In.ResetRepository;
//
//import java.util.Set;
//
//import static org.junit.Assert.*;
//
//public class ResetRepositoryImplTest {
//
//    private ResetRepository repository;
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = ResetRepositoryImpl.getRepository();
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
//        Set<Reset> reset = this.repository.getAll();
//        Assert.assertEquals(1, reset.size());
//    }
//}