package za.ac.cput.controller.Airline;
import za.ac.cput.domain.Airline.Booking;
import za.ac.cput.factory.Airline.BookingFactory;
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

public class BookingControllerTest {

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
        Booking booking = restTemplate.getForObject(baseURL + "/Booking/1", Booking.class);
        System.out.println(booking.getDestination());
        assertNotNull(booking);
    }

    @Ignore
    public void testCreateStudent() {
        Booking booking = BookingFactory.getBooking("10:00", "ff4", "Cape Town", "gh444", 9);


        ResponseEntity<Booking> postResponse = restTemplate.postForEntity(baseURL + "/create", booking, Booking.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateStudent() {
        int id = 1;
        Booking booking = restTemplate.getForObject(baseURL + "/Booking/" + id, Booking.class);

        restTemplate.put(baseURL + "/booking/" + id, booking);
        Booking updatedStudent = restTemplate.getForObject(baseURL + "/Booking/" + id, Booking.class);
        assertNotNull(updatedStudent);
    }

    @Ignore
    public void testDelete() {
        int id = 2;
        Booking booking = restTemplate.getForObject(baseURL + "/Booking/" + id, Booking.class);
        assertNotNull(booking);
        restTemplate.delete(baseURL + "/booking/" + id);
        try {
            booking = restTemplate.getForObject(baseURL + "/Booking/" + id, Booking.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}