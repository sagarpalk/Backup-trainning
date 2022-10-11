package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cybage.model.Complaint;
import com.cybage.repositories.ComplaintRepository;

@Service
public class ComplaintService {
	@Autowired
	private ComplaintRepository complaintRepository;

	public List<Complaint> getAllComplaint() {
		// TODO Auto-generated method stub
		 return complaintRepository.findAll();
	
	}
	

}
