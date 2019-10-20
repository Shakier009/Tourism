//package za.ac.cput.controller.Airline;
//
//import za.ac.cput.domain.Airline.Airline;
//import za.ac.cput.factory.Airline.AirlineFactory;
//
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
//
//
//@ContextConfiguration(classes = App.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@RunWith(SpringRunner.class)
//public class AirlineControllerTest {
//
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//    private String baseURL="http://localhost:8080/Airline";
//
//
//
//    @Ignore
//    public void testGetTouristById() {
//       Airline airline = restTemplate.getForObject(baseURL + "/Airline/1", Airline.class);
//       System.out.println(airline.getTicketNr());
//       assertNotNull(airline);
//    }
//
//    @Test
//    public void testCreateTourist() {
//        Airline airline = AirlineFactory.getAirline("John");
//        airline.setTicketNr("gr00");
//       ResponseEntity<Airline> postResponse = restTemplate.postForEntity(baseURL + "/new", airline, Airline.class);
//       assertNotNull(postResponse);
//       assertNotNull(postResponse.getBody());
//    }
//
//    @Test
//    public void testUpdateTourist() {
//        int id = 1;
//       Airline airline = restTemplate.getForObject(baseURL + "/Airline/" + id, Airline.class);
//
//        restTemplate.put(baseURL + "/airline/" + id, airline);
//        Airline updatedStudent = restTemplate.getForObject(baseURL + "/Airline/" + id, Airline.class);
//       assertNotNull(updatedStudent);
//    }
//
//    @Test
//    public void testDelete() {
//        int id = 2;
//       Airline airline = restTemplate.getForObject(baseURL + "/Airline/" + id, Airline.class);
//       assertNotNull(airline);
//       restTemplate.delete(baseURL + "/airline/" + id);
//        try {
//           airline = restTemplate.getForObject(baseURL + "/Airline/" + id, Airline.class);
//        } catch (final HttpClientErrorException e) {
//            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
//        }
//    }
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
//}