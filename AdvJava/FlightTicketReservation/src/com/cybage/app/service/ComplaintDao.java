package com.cybage.app.service;

import java.sql.SQLException;
import java.util.List;


import com.cybage.app.model.Complaint;

public interface ComplaintDao {

	List<Complaint> selectAllComplaints();

	void insertComplaint(Complaint complaint) throws SQLException;

	boolean updateComplaint(Complaint complaint) throws SQLException;

	List<Complaint> myComplaints(String userMail);

}
