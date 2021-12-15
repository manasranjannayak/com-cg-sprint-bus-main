package com.cg.sprint.bus.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@SpringBootTest
public class RouteControllerTests {
	
	@Autowired
	private  RouteController routeController;
	
	@Test
	public void testViewRoute() {
		HttpStatus expected = routeController.viewRoute(1).getStatusCode();
		HttpStatus actual = HttpStatus.OK;
		
		assertEquals(expected, actual);	
	}
	
	@Test
	public void deleteRoute() {
		HttpStatus expected =routeController.viewRoute(1).getStatusCode();
		HttpStatus actual = HttpStatus.OK;
		
		assertEquals(expected, actual);	
	}
	

}