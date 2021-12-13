package com.cg.sprint.bus.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.sprint.bus.model.FeedBack;

@SpringBootTest
public class FeedbackServiceTests {
	

	@Autowired
	private FeedBackService feedbackService;
	
	public void testDeleteBus() {
		FeedBack actual = feedbackService.deleteFeedBack(1);
		FeedBack expected = feedbackService.deleteFeedBack(1);
		
		assertEquals(actual, expected);
	}

}
