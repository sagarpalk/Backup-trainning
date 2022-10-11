package com.cybage.app.service;


import java.sql.SQLException;

import java.util.List;


import com.cybage.app.model.Feedback;

public interface FeedbackDao {



	List<Feedback> selectAllFeedbacks();

	void insertFeedback(Feedback feedback) throws SQLException;

	boolean deleteFeedback(int fd_feedbackid) throws SQLException;

	boolean updateFeedback(Feedback feedback) throws SQLException;



	Feedback selectFeedback(int fd_feedbackid);

	

	List<Feedback> myFeedbacks(String userMail);

}
