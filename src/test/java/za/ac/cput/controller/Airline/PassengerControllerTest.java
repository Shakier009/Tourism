//package za.ac.cput.controller.Airline;
//import za.ac.cput.domain.Airline.Passenger;
//import za.ac.cput.factory.Airline.PassengerFactory;
//import za.ac.cput.service.Airline.impl.PassengerServiceImpl;
//import junit.framework.TestCase;
//import org.springframework.stereotype.Controller;
//import org.springframework.test.context.ContextConfiguration;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.*;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.web.client.HttpClientErrorException;
//import static junit.framework.TestCase.assertEquals;
//import static junit.framework.TestCase.assertNotNull;
//import za.ac.cput.App;
//
//@ContextConfiguration(classes = App.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@RunWith(SpringRunner.class)
//public class PassengerControllerTest {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private String baseURL="http://localhost:8080/Passenger";
//
//    @Test
//    public void testGetAll() {
//        HttpHeaders headers = new HttpHeaders();
//
//        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
//        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
//                HttpMethod.GET, entity, String.class);
//        //assertNotNull(response.getBody());
//        TestCase.assertNotNull(response.getBody());
//        System.out.println(response.getBody());
//    }
//
//    @Ignore
//    public void testGetStudentById() {
//        Passenger passenger = restTemplate.getForObject(baseURL + "/Passenger/1", Passenger.class);
//        System.out.println(passenger.getPsnName());
//        assertNotNull(passenger);
//    }
//
//    @Ignore
//    public void testCreateStudent() {
//        Passenger passenger = PassengerFactory.getPassenger("Gregory", "Martin", "hgh333", 21);
//
//
//        ResponseEntity<Passenger> postResponse = restTemplate.postForEntity(baseURL + "/create", passenger, Passenger.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
//    }
//
//    @Ignore
//    public void testUpdateStudent() {
//        int id = 1;
//        Passenger passenger = restTemplate.getForObject(baseURL + "/Passenger/" + id, Passenger.class);
//
//        restTemplate.put(baseURL + "/passenger/" + id, passenger);
//        Passenger updatedStudent = restTemplate.getForObject(baseURL + "/Passenger/" + id, Passenger.class);
//        assertNotNull(updatedStudent);
//    }
//
//    @Ignore
//    public void testDelete() {
//        int id = 2;
//        Passenger passenger = restTemplate.getForObject(baseURL + "/Passenger/" + id, Passenger.class);
//        assertNotNull(passenger);
//        restTemplate.delete(baseURL + "/passenger/" + id);
//        try {
//            passenger = restTemplate.getForObject(baseURL + "/Passenger/" + id, Passenger.class);
//        } catch (final HttpClientErrorException e) {
//            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
//        }
//    }
//}