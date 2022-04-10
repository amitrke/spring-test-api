package com.example.restapi;

import com.example.restapi.model.APIResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SampleAPITest {

    @Test
    public void testStatus() {
        String serverURI="http://localhost:8080/status";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<APIResponse> response =restTemplate.getForEntity(serverURI, APIResponse.class);
        assertThat(response.getStatusCode().is2xxSuccessful()).isEqualTo(true);
    }
}
