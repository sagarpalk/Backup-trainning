package com.cybage.app.model;

public class BookTicket {
	private int scheduleId;
	private int passportId;
	private  String classType;
	private int numTickets;
	private String Status;
	private int userId;
	public BookTicket() {
		// TODO Auto-generated constructor stub
	}
	public BookTicket(int scheduleId, int passportId, String classType, int numTickets, String status, int userId) {
		super();
		this.scheduleId = scheduleId;
		this.passportId = passportId;
		this.classType = classType;
		this.numTickets = numTickets;
		Status = status;
		this.userId = userId;
	}
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public int getNumTickets() {
		return numTickets;
	}
	public void setNumTickets(int numTickets) {
		this.numTickets = numTickets;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "BookTicket [scheduleId=" + scheduleId + ", passportId=" + passportId + ", classType=" + classType
				+ ", numTickets=" + numTickets + ", Status=" + Status + ", userId=" + userId + "]";
	}
	
	
	 

}
