//package za.ac.cput.repository.impl.Log_In;
//
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import za.ac.cput.domain.Log_In.Register;
//import za.ac.cput.repository.Log_In.RegisterRepository;
//
//import java.util.Set;
//
//import static org.junit.Assert.*;
//
//public class RegisterRepositoryImplTest {
//
//    private RegisterRepository repository;
//
//    @Before
//    public void setUp() throws Exception {
//        this.repository = RegisterRepositoryImpl.getRepository();
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
//        Set<Register> register = this.repository.getAll();
//        Assert.assertEquals(1, register.size());
//    }
//}