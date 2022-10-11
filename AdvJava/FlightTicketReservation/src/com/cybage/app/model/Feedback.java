package com.cybage.app.model;

/*
 * * <!-- fd_feedback
fd_feedbackid
fd_flightid
fd_rating
fd_userid -->
*/

public class Feedback {

    private int fd_feedbackid;
    private String fd_feedback;
    private int fd_flightid;
    private int fd_rating;
    private int fd_userid;
 
    protected Feedback() {

    }
    public Feedback(int fd_feedbackid, String fd_feedback, int fd_rating, int fd_flightid,  int fd_userid) {
		super();
		this.fd_feedbackid = fd_feedbackid;
		this.fd_feedback = fd_feedback;
		this.fd_flightid = fd_flightid;
		this.fd_rating = fd_rating;
		this.fd_userid = fd_userid;
		//for updating existing feedback
	}


    public Feedback(String fd_feedback, int fd_rating, int fd_flightid, int fd_userid) {
		// TODO Auto-generated constructor stub
    	//for creating new feedback
	}


   
	public Feedback(int fd_feedbackid, String fd_feedback, int fd_rating) {

		this.fd_feedbackid = fd_feedbackid;
		this.fd_feedback = fd_feedback;
		
		this.fd_rating = fd_rating;
		
		
		
		
	}
	public int getFd_feedbackid() {
		return fd_feedbackid;
	}
	public void setFd_feedbackid(int fd_feedbackid) {
		this.fd_feedbackid = fd_feedbackid;
	}
	public String getFd_feedback() {
		return fd_feedback;
	}
	public void setFd_feedback(String fd_feedback) {
		this.fd_feedback = fd_feedback;
	}
	public int getFd_flightid() {
		return fd_flightid;
	}
	public void setFd_flightid(int fd_flightid) {
		this.fd_flightid = fd_flightid;
	}
	public int getFd_rating() {
		return fd_rating;
	}
	public void setFd_rating(int fd_rating) {
		this.fd_rating = fd_rating;
	}
	public int getFd_userid() {
		return fd_userid;
	}
	public void setFd_userid(int fd_userid) {
		this.fd_userid = fd_userid;
	}
	
}