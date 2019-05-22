package za.ac.cput.controller.Airline;
import za.ac.cput.domain.Airline.Booking;
import za.ac.cput.factory.Airline.BookingFactory;
import za.ac.cput.service.Airline.impl.BookingServiceImpl;
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

public class BookingControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/student";

    @Test
    public void testGetAllBooking() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }



    @Ignore
    public void testCreateBooking() {
        Booking booking = BookingFactory.getAirline("John"," Doh",29);

        ResponseEntity<k> postResponse = restTemplate.postForEntity(baseURL + "/create", airline, booking.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateBooking() {
        int id = 1;
        Booking airline = restTemplate.getForObject(baseURL + "/Booking/" + id, Booking.class);

        restTemplate.put(baseURL + "/airline/" + id, airline);
        Booking updatedAirline = restTemplate.getForObject(baseURL + "/Booking/" + id, Booking.class);
        assertNotNull(updatedBooking);
    }
}