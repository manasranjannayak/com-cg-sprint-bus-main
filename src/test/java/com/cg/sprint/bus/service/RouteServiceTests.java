package com.cg.sprint.bus.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.sprint.bus.model.Route;

@SpringBootTest
public class RouteServiceTests {

	@Autowired
	private  RouteService routeService;
	
	public void testDeleteRoute() {
		Route actual = routeService.deleteRoute(1);
	    Route expected = routeService.deleteRoute(1);
		
		assertEquals(actual, expected);
	}
}
