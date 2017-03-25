package com.marvel.comics;

import domain.CharacterMarvel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarvelComicsApplicationTests {
    @Autowired Environment env;
	RestTemplate restTemplate;

    @Before
    public void setup() {
        this.restTemplate = new RestTemplate();
    }

	@Test
	public void contextLoads() {

	}

	@Test
    public void getAvengersTest() {
        ResponseEntity<CharacterMarvel> avengers =
                restTemplate.getForEntity(env.getProperty("marvel.api") +
                                "/characters?name=avengers&apikey=" +
                                env.getProperty("marvel.api.public.key"),
                        CharacterMarvel.class);

        avengers.getStatusCode();

    }

}
