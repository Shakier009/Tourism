package za.ac.cput.controller.Airline;
import za.ac.cput.domain.Airline.FlightDetails;
import za.ac.cput.factory.Airline.FlightDetailsFactory;
import za.ac.cput.service.Airline.impl.FlightDetailsServiceImpl;
import junit.framework.TestCase;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import za.ac.cput.App;

@ContextConfiguration(classes = App.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)

public class FlightDetailsControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/student";

    @Test
    public void testGetAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        //assertNotNull(response.getBody());
        TestCase.assertNotNull(response.getBody());
        System.out.println(response.getBody());
    }

    @Ignore
    public void testGetStudentById() {
        FlightDetails flightDetails = restTemplate.getForObject(baseURL + "/flightDetails/1", FlightDetails.class);
        System.out.println(flightDetails.getFlightClss());
        assertNotNull(flightDetails);
    }

    @Ignore
    public void testCreateStudent() {
        FlightDetails flightDetails = FlightDetailsFactory.getFlightDetails("A3", "7B", 34, 77);


        ResponseEntity<FlightDetails> postResponse = restTemplate.postForEntity(baseURL + "/create", flightDetails, FlightDetails.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateStudent() {
        int id = 1;
        FlightDetails flightDetails = restTemplate.getForObject(baseURL + "/FlightDetails/" + id, FlightDetails.class);

        restTemplate.put(baseURL + "/flightDetails/" + id, flightDetails);
        FlightDetails updatedStudent = restTemplate.getForObject(baseURL + "/FlightDetails/" + id, FlightDetails.class);
        assertNotNull(updatedStudent);
    }

    @Ignore
    public void testDelete() {
        int id = 2;
        FlightDetails flightDetails = restTemplate.getForObject(baseURL + "/FlightDetails/" + id, FlightDetails.class);
        assertNotNull(flightDetails);
        restTemplate.delete(baseURL + "/flightDetails/" + id);
        try {
            flightDetails = restTemplate.getForObject(baseURL + "/FlightDetails/" + id, FlightDetails.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}