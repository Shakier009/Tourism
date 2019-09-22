package za.ac.cput.controller.Airline;
import za.ac.cput.domain.Airline.Plane;
import za.ac.cput.factory.Airline.PlaneFactory;
import za.ac.cput.service.Airline.impl.PlaneServiceImpl;
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

public class PlaneControllerTest {

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
        Plane plane = restTemplate.getForObject(baseURL + "/Plane/1", Plane.class);
        System.out.println(plane.getPlneCode());
        assertNotNull(plane);
    }

    @Ignore
    public void testCreateStudent() {
        Plane plane = PlaneFactory.getPlane("Mark3", "xxx7749");


        ResponseEntity<Plane> postResponse = restTemplate.postForEntity(baseURL + "/create", plane, Plane.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateStudent() {
        int id = 1;
        Plane plane = restTemplate.getForObject(baseURL + "/Plane/" + id, Plane.class);

        restTemplate.put(baseURL + "/plane/" + id, plane);
        Plane updatedStudent = restTemplate.getForObject(baseURL + "/Plane/" + id, Plane.class);
        assertNotNull(updatedStudent);
    }

    @Ignore
    public void testDelete() {
        int id = 2;
        Plane plane = restTemplate.getForObject(baseURL + "/Plane/" + id, Plane.class);
        assertNotNull(plane);
        restTemplate.delete(baseURL + "/plane/" + id);
        try {
            plane = restTemplate.getForObject(baseURL + "/Plane/" + id, Plane.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

}
