package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Feedback;
import com.cybage.repositories.FeedbackRepository;

@Service
public class FeedbackService {
	@Autowired
	private FeedbackRepository feedbackRepository;

	public Feedback addFeedback(Feedback feedback) {
		System.out.println(feedback);
		System.out.println("in service method");
		return feedbackRepository.save(feedback);
	}

	public List<Feedback> getAllFeedback() {
		return feedbackRepository.findAll();
	}

	public Feedback getById(int id) {
		feedbackRepository.findById(id);
		return feedbackRepository.getById(id);
	}

	public void removeFeedback(Feedback feedback) {
		feedbackRepository.delete(feedback);
		System.out.println("Record deleted from Database");
	}

	public void updateFeedback(Feedback feedback) {
		feedbackRepository.save(feedback);
		System.out.println("Record deleted from Database");

	}

}
