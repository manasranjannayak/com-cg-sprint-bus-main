package com.cg.sprint.bus.controller;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@SpringBootTest
public class ReservationControllerTests {
	
	@Autowired
	private ReservationController reservationController;
	
	@Test
	public void testViewReservation() {
		HttpStatus expected =reservationController.viewReservation(1).getStatusCode();
		HttpStatus actual = HttpStatus.OK;
		
		assertEquals(expected, actual);	
	}
	
	@Test
	public void deleteReservation() {
		HttpStatus expected = reservationController.viewReservation(1).getStatusCode();
		HttpStatus actual = HttpStatus.OK;
		
		assertEquals(expected, actual);	
	}
	

}
