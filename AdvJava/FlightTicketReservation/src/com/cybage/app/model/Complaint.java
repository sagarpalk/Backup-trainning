package com.cybage.app.model;



public class Complaint {

    private int c_complaintid;
    private String c_complaint;
    private int c_flightid;
    private int c_userid;
    private String c_status;
 

    protected Complaint() {

    }



    public Complaint(int c_complaintid, String c_complaint, int c_flightid, int c_userid, String c_status) {
		super();
		this.c_complaintid = c_complaintid;
		this.c_complaint = c_complaint;
		this.c_flightid = c_flightid;
		this.c_userid = c_userid;
		this.c_status = c_status;
	}



	public Complaint(String c_status, int c_complaintid) {
		// TODO Auto-generated constructor stub
		//to change the status
		this.c_status = c_status;
	
		this.c_complaintid = c_complaintid;
		
	}



	public int getC_complaintid() {
		return c_complaintid;
	}



	public void setC_complaintid(int c_complaintid) {
		this.c_complaintid = c_complaintid;
	}



	public String getC_complaint() {
		return c_complaint;
	}



	public void setC_complaint(String c_complaint) {
		this.c_complaint = c_complaint;
	}



	public int getC_flightid() {
		return c_flightid;
	}



	public void setC_flightid(int c_flightid) {
		this.c_flightid = c_flightid;
	}



	public int getC_userid() {
		return c_userid;
	}



	public void setC_userid(int c_userid) {
		this.c_userid = c_userid;
	}



	public String getC_status() {
		return c_status;
	}



	public void setC_status(String c_status) {
		this.c_status = c_status;
	}




	
}