package za.ac.cput.controller.Airline;
import za.ac.cput.domain.Airline.Plane;
import za.ac.cput.factory.Airline.PlaneFactory;
import za.ac.cput.service.Airline.impl.PlaneServiceImpl;
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

public class PlaneControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/student";

    @Test
    public void testGetAllPlane() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }



    @Ignore
    public void testCreatePlane() {
        Plane plane = PlaneFactory.getPlane("John"," Doh",29);

        ResponseEntity<Plane> postResponse = restTemplate.postForEntity(baseURL + "/create", plane, Plane.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdatePlane() {
        int id = 1;
        Plane plane = restTemplate.getForObject(baseURL + "/Plane/" + id, Plane.class);

        restTemplate.put(baseURL + "/airline/" + id, airline);
        Plane updatedPlane = restTemplate.getForObject(baseURL + "/Airline/" + id, Plane.class);
        assertNotNull(updatedPlane);
    }
}