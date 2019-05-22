package za.ac.cput.controller.Airline;
import za.ac.cput.domain.Airline.FlightDetails;
import za.ac.cput.factory.Airline.FlightDetailsFactory;
import za.ac.cput.service.Airline.impl.FlightDetailsServiceImpl;
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

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)

public class FlightDetailsControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/student";

    @Test
    public void testGetAllFlightDetails() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }



    @Ignore
    public void testCreateFlightDetails() {
        FlightDetails flightDetails = FlightDetailsFactory.getFlightDetails("John"," Doh",29);

        ResponseEntity<FlightDetails> postResponse = restTemplate.postForEntity(baseURL + "/create", flightDetails, FlightDetails.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateAirline() {
        int id = 1;
        FlightDetails flightDetails = restTemplate.getForObject(baseURL + "/flightDetails/" + id, FlightDetails.class);

        restTemplate.put(baseURL + "/flightDetails/" + id, airline);
        FlightDetails updatedFlightDetails = restTemplate.getForObject(baseURL + "/FlightDetails/" + id, FlightDetails.class);
        assertNotNull(updatedFlightDetails);
    }
}