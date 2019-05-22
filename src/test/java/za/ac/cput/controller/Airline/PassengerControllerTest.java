package za.ac.cput.controller.Airline;
import za.ac.cput.domain.Airline.Passenger;
import za.ac.cput.factory.Airline.PassengerFactory;
import za.ac.cput.service.Airline.impl.PassengerServiceImpl;
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

public class PassengerControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/student";

    @Test
    public void testGetAllPassenger() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }



    @Ignore
    public void testCreatePassenger() {
        Passenger passenger = PassengerFactory.getPassenger("John"," Doh",29);

        ResponseEntity<Passenger> postResponse = restTemplate.postForEntity(baseURL + "/create", passenger, Passenger.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdatePassenger() {
        int id = 1;
        Passenger passenger = restTemplate.getForObject(baseURL + "/passenger/" + id, Passenger.class);

        restTemplate.put(baseURL + "/airline/" + id, passenger);
        Passenger updatedPassenger = restTemplate.getForObject(baseURL + "/passenger/" + id, Passenger.class);
        assertNotNull(updatedPassenger);
    }
}