package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Passenger;
import com.cybage.model.Feedback;
import com.cybage.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
@CrossOrigin("*")
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackService;

	@PostMapping("/")
	public ResponseEntity<String> addFeedback(@RequestBody Feedback feedback1) {
//		System.out.println("In Postman ..");
//		Passenger passenger=feedback.getPassenger();
//		int id=passenger.getPassengerId();
		System.out.println("hello");
		feedbackService.addFeedback(feedback1);
		return new ResponseEntity<String>("Feedback added successfully", HttpStatus.CREATED);
	}

	@GetMapping("/getAllFeedback")
	public ResponseEntity<List<Feedback>> getAllFeedback() {
		return new ResponseEntity<List<Feedback>>(feedbackService.getAllFeedback(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteFeedback(@PathVariable int feedbackId) {
		Feedback feedback = feedbackService.getById(feedbackId);
		feedbackService.removeFeedback(feedback);
		return new ResponseEntity<String>("Feedback record deleted successfully", HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Feedback> getFeedbackById(@PathVariable int feedbackId) {
		Feedback feedback = feedbackService.getById(feedbackId);
		return new ResponseEntity<Feedback>(feedback, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateFeedback(@RequestBody Feedback feedback) {
		feedbackService.updateFeedback(feedback);
		return new ResponseEntity<String>("Record updated successfully", HttpStatus.CREATED);
	}
}
