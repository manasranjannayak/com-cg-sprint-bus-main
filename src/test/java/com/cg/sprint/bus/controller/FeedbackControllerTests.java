package com.cg.sprint.bus.controller;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@SpringBootTest
public class FeedbackControllerTests {
	@Autowired
	private FeedBackController feedbackController;
	
	@Test
	public void testViewFeedBack() {
		HttpStatus expected = feedbackController.viewFeedBack(1).getStatusCode();
		HttpStatus actual = HttpStatus.OK;
		
		assertEquals(expected, actual);	
	}
	
	@Test
	public void deleteFeedBack() {
		HttpStatus expected = feedbackController.deleteFeedBack(1).getStatusCode();
		HttpStatus actual = HttpStatus.OK;
		
		assertEquals(expected, actual);	
	}
}
