package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "complaint")
public class Complaint {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int complaintId;

	private String description;
	private String complaintType;

	@ManyToOne
	@JoinColumn(name = "passengerId")
	private Passenger passenger;

	public Complaint() {
		super();
	}

	public Complaint(int complaintId, String description, String complaintType, Passenger passenger) {
		super();
		this.complaintId = complaintId;
		this.description = description;
		this.complaintType = complaintType;
		this.passenger = passenger;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", description=" + description + ", complaintType="
				+ complaintType + ", passenger=" + passenger + "]";
	}

	

}
