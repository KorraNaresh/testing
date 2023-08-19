package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Myfood1ApplicationTests {

    @MockBean
    private FoodController foodController;

    private TestRestTemplate restTemplate;

    @BeforeEach
    void setUp() {
        restTemplate = new TestRestTemplate();
    }

    @Test
    void testGetHomeEndpoint() {
        // Mock the behavior of the FoodController
        when(foodController.gethome()).thenReturn("hello");

        ResponseEntity<String> response = restTemplate.getForEntity("/home", String.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("hello", response.getBody());
    }
}