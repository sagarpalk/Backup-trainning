package com.cybage.app.dao;



import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;


import com.cybage.app.model.Complaint;

import com.cybage.app.service.ComplaintDao;
import com.cybage.app.utilities.JDBCconnectivity;






public class ComplaintDaoImpl implements ComplaintDao {

	    private static final String SELECT_ALL_COMPLAINT = "select * from complaint";
       private static final String INSERT_COMPLAINT_SQL = "INSERT INTO complaint" +
           "  ( c_complaint, c_flightid, c_userid, c_status) VALUES " + " ( ?, ?, ?, ?);";
//    
//	    private static final String DELETE_FEEDBACK_BY_ID = "delete from feedback where fd_feedbackid = ?;";
	 //   private static final String SELECT_COMPLAINT_BY_ID = "select *from complaint where  c_useridd=?";
        private static final String UPDATE_COMPLAINT_STATUS = "update complaint set c_status= ? where c_complaintid = ?;";       private static final String SELECT_MYFEEDBACKS= "select * from feedback where fd_userid= (select u_userid from user where u_email= ? ); ";
//         //select * from feedback where fd_userid= (select u_userid from user where u_email= "ajay@cybage.com");
        private static final String SELECT_MYCOMPLAINTS= "select * from complaint where c_userid= (select u_userid from user where u_email= ? ); ";
        
    public ComplaintDaoImpl() {}

    @Override
    public List < Complaint > selectAllComplaints() {
                System.out.println("inside the comp. method");
        List < Complaint > complaints = new ArrayList < > ();
        try (Connection connection = JDBCconnectivity.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_COMPLAINT);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
           
//        	c_complaintid
//        	c_complaint
//        	c_flightid
//        	c_userid
//        	c_status
            while (rs.next()) {
            	int c_complaintid=rs.getInt("c_complaintid");
                String c_complaint = rs.getString("c_complaint");
                int c_flightid=rs.getInt("c_flightid");
                int c_userid=rs.getInt("c_userid");
                String c_status=rs.getString("c_status");
                
                complaints.add(new Complaint(c_complaintid, c_complaint,c_flightid, c_userid,  c_status));
                
               // System.out.println("printed feedbacks:");
               //.out.println(fd_feedbackid);
               //.out.println(fd_feedback);
            }
        } catch (SQLException exception) {
        	JDBCconnectivity.printSQLException(exception);
        }
        return complaints;
    }

    @Override
    public void insertComplaint(Complaint complaint) throws SQLException {
        System.out.println(INSERT_COMPLAINT_SQL);
        /*
       <!-- c_complaintid
c_complaint
c_flightid
c_userid
c_status -->	
        */
        try (Connection connection = JDBCconnectivity.getConnection();
        	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_COMPLAINT_SQL)) {
          
            preparedStatement.setString(1, complaint.getC_complaint());
            preparedStatement.setInt(2, complaint.getC_flightid());
            preparedStatement.setInt(3, complaint.getC_userid());
            preparedStatement.setString(4, complaint.getC_status());
           
          
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
        	JDBCconnectivity.printSQLException(exception);
        }
    }
    
    @Override
    public boolean updateComplaint(Complaint complaint) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = JDBCconnectivity.getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_COMPLAINT_STATUS);) {
            statement.setString(1, complaint.getC_status());
            statement.setInt(2, complaint.getC_complaintid());
          
            rowUpdated = statement.executeUpdate() >0;
            
            System.out.println("controls came in update complaint status"+  complaint.getC_status());
            
        }
        
        return rowUpdated;
    }
    @Override
    public List < Complaint > myComplaints(String userMail) {
     
//    	 <!-- c_complaintid
//    	 c_complaint
//    	 c_flightid
//    	 c_userid
//    	 c_status -->
    	 // String str= session.getAttribute("currentUser");
    	 // String currentuser = (String) session.getSession().getAttribute("currentUser");
    	
            String usermailId= "ajaysu@cybage.com";
        List < Complaint > complaints = new ArrayList < > ();
        try (Connection connection = JDBCconnectivity.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MYCOMPLAINTS);) {
        	
        	 preparedStatement.setString(1, usermailId);
             System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            System.out.println("control is inside the  my complaints method");

            while (rs.next()) {
            	int c_complaintid=rs.getInt("c_complaintid");
                String c_complaint = rs.getString("c_complaint");
                int c_flightid=rs.getInt("c_flightid");
                int c_userid=rs.getInt("c_userid");
                String c_status = rs.getString("c_status");
               ;
               
                complaints.add(new Complaint(c_complaintid,c_complaint, c_flightid,c_userid,  c_status));
                
               // System.out.println("printed feedbacks:");
               //.out.println(fd_feedbackid);
               //.out.println(fd_feedback);
            }
        } catch (SQLException exception) {
        	JDBCconnectivity.printSQLException(exception);
        }
        return complaints;
    }
	
   
}
