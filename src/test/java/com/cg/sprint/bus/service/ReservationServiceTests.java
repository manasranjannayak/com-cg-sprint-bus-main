package com.cg.sprint.bus.service;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.sprint.bus.model.Reservation;

@SpringBootTest
public class ReservationServiceTests {
	

	@Autowired
	private ReservationService reservationService;
	
	public void testDeleteReservation() {
		Reservation actual = reservationService.deleteReservation(1);
		Reservation expected = reservationService.deleteReservation(1);
		
		assertEquals(actual, expected);
	}


}
