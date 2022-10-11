package com.cybage.app.dao;


import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.cybage.app.model.Feedback;
import com.cybage.app.service.FeedbackDao;
import com.cybage.app.utilities.JDBCconnectivity;

//JDBCUtils


public class FeedbackDaoImpl implements FeedbackDao {
//	 <!-- fd_feedback
//	 fd_feedbackid
//	 fd_flightid
//	 fd_rating
//	 fd_userid -->
	    private static final String SELECT_ALL_FEEDBACKS = "select * from feedback";
	    private static final String INSERT_FEEDBACK_SQL = "INSERT INTO feedback" +
	        "  (fd_feedback, fd_rating, fd_flightid, fd_userid) VALUES " + " (?, ?, ?, ?);";
    
	    private static final String DELETE_FEEDBACK_BY_ID = "delete from feedback where fd_feedbackid = ?;";
	    private static final String SELECT_FEEDBACK_BY_ID = "select *from feedback where fd_feedbackid=?";
        private static final String UPDATE_FEEDBACK = "update feedback set fd_feedback = ?, fd_rating= ? where fd_feedbackid = ?;";
        private static final String SELECT_MYFEEDBACKS= "select * from feedback where fd_userid= (select u_userid from user where u_email= ? ); ";
         //select * from feedback where fd_userid= (select u_userid from user where u_email= "ajay@cybage.com");
  
    public FeedbackDaoImpl() {}

    @Override
    public List < Feedback > selectAllFeedbacks() {
                System.out.println("inside the method");
        List < Feedback > feedbacks = new ArrayList < > ();
        try (Connection connection = JDBCconnectivity.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_FEEDBACKS);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
           

            while (rs.next()) {
            	int fd_feedbackid=rs.getInt("fd_feedbackid");
                String fd_feedback = rs.getString("fd_feedback");
                int fd_rating=rs.getInt("fd_rating");
                int fd_flightid=rs.getInt("fd_flightid");
                int fd_userid=rs.getInt("fd_userid");
                feedbacks.add(new Feedback(fd_feedbackid, fd_feedback,fd_flightid, fd_rating,  fd_userid));
                
               // System.out.println("printed feedbacks:");
               //.out.println(fd_feedbackid);
               //.out.println(fd_feedback);
            }
        } catch (SQLException exception) {
        	JDBCconnectivity.printSQLException(exception);
        }
        return feedbacks;
    }

    @Override
    public List < Feedback > myFeedbacks(String userMail) {
    	
    	
          // String usermailId= "ajay@cybage.com";
                
        List < Feedback > feedbacks = new ArrayList < > ();
        try (Connection connection = JDBCconnectivity.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MYFEEDBACKS);) {
        	
        	 preparedStatement.setString(1, userMail);
             System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            System.out.println("control is inside the method");

            while (rs.next()) {
            	int fd_feedbackid=rs.getInt("fd_feedbackid");
                String fd_feedback = rs.getString("fd_feedback");
                int fd_rating=rs.getInt("fd_rating");
                int fd_flightid=rs.getInt("fd_flightid");
                int fd_userid=rs.getInt("fd_userid");
                feedbacks.add(new Feedback(fd_feedbackid, fd_feedback,fd_flightid, fd_rating,  fd_userid));
                
               // System.out.println("printed feedbacks:");
               //.out.println(fd_feedbackid);
               //.out.println(fd_feedback);
            }
        } catch (SQLException exception) {
        	JDBCconnectivity.printSQLException(exception);
        }
        return feedbacks;
    }

    @Override
    public void insertFeedback(Feedback feedback) throws SQLException {
        System.out.println(INSERT_FEEDBACK_SQL);
        /*
         * * <!-- fd_feedback
        fd_feedbackid
        fd_flightid
        fd_rating
        fd_userid -->
        */
        try (Connection connection = JDBCconnectivity.getConnection();
        	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_FEEDBACK_SQL)) {
          
            preparedStatement.setString(1, feedback.getFd_feedback());
            preparedStatement.setInt(2, feedback.getFd_rating());
            preparedStatement.setInt(3, feedback.getFd_flightid());
            preparedStatement.setInt(4, feedback.getFd_userid());
          
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
        	JDBCconnectivity.printSQLException(exception);
        }
    }
    @Override
    public Feedback selectFeedback(int fd_feedbackid) {
              Feedback feedback=null;
       
        try (Connection connection = JDBCconnectivity.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FEEDBACK_BY_ID);) {
            preparedStatement.setInt(1, fd_feedbackid);
            System.out.println(preparedStatement);
   
            ResultSet rs = preparedStatement.executeQuery();
            /*
             * * <!-- fd_feedback
            fd_feedbackid
            fd_flightid
            fd_rating
            fd_userid -->
            */
      
            while (rs.next()) {
                 int fd_feedbackid2=rs.getInt("fd_feedbackid");
            	String fd_feedback=rs.getString("fd_feedback");
            	int fd_rating=rs.getInt("fd_rating");
            	int fd_flightid=rs.getInt("fd_flightid");
            	int fd_userid=rs.getInt("fd_userid");
                  feedback = new Feedback(fd_feedbackid2, fd_feedback, fd_rating, fd_flightid, fd_userid);
            }
        } catch (SQLException exception) {
        	JDBCconnectivity.printSQLException(exception);
        }
        return feedback;
    }

        @Override
    public boolean updateFeedback(Feedback feedback) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = JDBCconnectivity.getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_FEEDBACK);) {
            statement.setString(1, feedback.getFd_feedback());
            statement.setInt(2, feedback.getFd_rating());
            statement.setInt(3, feedback.getFd_feedbackid());
            rowUpdated = statement.executeUpdate() > 0;
            System.out.println("controls came in update feedback"+feedback.getFd_feedback());
            
        }
        
        return rowUpdated;
    }


    @Override
    public boolean deleteFeedback(int fd_feedbackid) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = JDBCconnectivity.getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_FEEDBACK_BY_ID);) {
            statement.setInt(1, fd_feedbackid);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

	

	

	
   
}
