package com.cybage.app.model;

import java.sql.Time;
import java.util.Date;

public class BookingInfo {
	private int tickitId;
	private String firstName;
	private String lastName;
	private String flightName;
	private String seviceCompany;
	private Date  departureDate;
	private Date  arrivalDate;
	private Time  departureTime;
	private Time  arrivalTime;
	private String  flightType;
	private String  source;
	private String  destination;
	private double  Totalprice;
	private String status;
	private int numberOfTickets;
	private int priceEconomy;
	private int pricePrimium;
	private int priceBusiness;
	private int seatEconomy;
	private int seatPrimium;
	private int seatBusiness;
	private String offerName;
	private int offerrate;
	private String seatType;
    private int schduleId;
    private String shift;
	
	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public int getSchduleId() {
		return schduleId;
	}

	public void setSchduleId(int schduleId) {
		this.schduleId = schduleId;
	}

	public BookingInfo() {
		// TODO Auto-generated constructor stub
	}

	public BookingInfo(int tickitId, String firstName, String lastName, String flightName, String seviceCompany,
			Date departureDate, Date arrivalDate, Time departureTime, Time arrivalTime, String flightType,
			String source, String destination, double totalprice, String status, int numberOfTickets, int priceEconomy,
			int pricePrimium, int priceBusiness, int seatEconomy, int seatPrimium, int seatBusiness, String offerName,
			int offerrate, String seatType) {
		super();
		this.tickitId = tickitId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.flightName = flightName;
		this.seviceCompany = seviceCompany;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.flightType = flightType;
		this.source = source;
		this.destination = destination;
		Totalprice = totalprice;
		this.status = status;
		this.numberOfTickets = numberOfTickets;
		this.priceEconomy = priceEconomy;
		this.pricePrimium = pricePrimium;
		this.priceBusiness = priceBusiness;
		this.seatEconomy = seatEconomy;
		this.seatPrimium = seatPrimium;
		this.seatBusiness = seatBusiness;
		this.offerName = offerName;
		this.offerrate = offerrate;
		this.seatType = seatType;
	}


	public BookingInfo(int tickitId, String firstName, String lastName, String flightName, String seviceCompany,
			Date departureDate, Date arrivalDate, Time departureTime, Time arrivalTime, String flightType,
			String source, String destination, double totalprice, String status, int numberOfTickets, String offerName,
			int offerrate, String seatType ,String shift) {
		super();
		this.tickitId = tickitId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.flightName = flightName;
		this.seviceCompany = seviceCompany;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.flightType = flightType;
		this.source = source;
		this.destination = destination;
		Totalprice = totalprice;
		this.status = status;
		this.numberOfTickets = numberOfTickets;
		this.offerName = offerName;
		this.offerrate = offerrate;
		this.seatType = seatType;
		this.shift=shift;
	}
	
	

	

	public int getTickitId() {
		return tickitId;
	}

	public void setTickitId(int tickitId) {
		this.tickitId = tickitId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSeviceCompany() {
		return seviceCompany;
	}

	public void setSeviceCompany(String seviceCompany) {
		this.seviceCompany = seviceCompany;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getTotalprice() {
		return Totalprice;
	}

	public void setTotalprice(double totalprice) {
		Totalprice = totalprice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public int getPriceEconomy() {
		return priceEconomy;
	}

	public BookingInfo(int tickitId, String firstName, String lastName, String flightName, String seviceCompany,
			int numberOfTickets, String seatType, int schduleId,String shift) {
		super();
		this.tickitId = tickitId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.flightName = flightName;
		this.seviceCompany = seviceCompany;
		this.numberOfTickets = numberOfTickets;
		this.seatType = seatType;
		this.schduleId = schduleId;
		this.shift=shift;
	}

	public void setPriceEconomy(int priceEconomy) {
		this.priceEconomy = priceEconomy;
	}

	public int getPricePrimium() {
		return pricePrimium;
	}

	public void setPricePrimium(int pricePrimium) {
		this.pricePrimium = pricePrimium;
	}

	public int getPriceBusiness() {
		return priceBusiness;
	}

	public void setPriceBusiness(int priceBusiness) {
		this.priceBusiness = priceBusiness;
	}

	public int getSeatEconomy() {
		return seatEconomy;
	}

	public void setSeatEconomy(int seatEconomy) {
		this.seatEconomy = seatEconomy;
	}

	public int getSeatPrimium() {
		return seatPrimium;
	}

	public void setSeatPrimium(int seatPrimium) {
		this.seatPrimium = seatPrimium;
	}

	public int getSeatBusiness() {
		return seatBusiness;
	}

	public void setSeatBusiness(int seatBusiness) {
		this.seatBusiness = seatBusiness;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public int getOfferrate() {
		return offerrate;
	}

	public void setOfferrate(int offerrate) {
		this.offerrate = offerrate;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	@Override
	public String toString() {
		return "BookingInfo [tickitId=" + tickitId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", flightName=" + flightName + ", seviceCompany=" + seviceCompany + ", departureDate=" + departureDate
				+ ", arrivalDate=" + arrivalDate + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", flightType=" + flightType + ", source=" + source + ", destination=" + destination + ", Totalprice="
				+ Totalprice + ", status=" + status + ", numberOfTickets=" + numberOfTickets + ", priceEconomy="
				+ priceEconomy + ", pricePrimium=" + pricePrimium + ", priceBusiness=" + priceBusiness
				+ ", seatEconomy=" + seatEconomy + ", seatPrimium=" + seatPrimium + ", seatBusiness=" + seatBusiness
				+ ", offerName=" + offerName + ", offerrate=" + offerrate + ", seatType=" + seatType + ", schduleId="
				+ schduleId + ", shift=" + shift + "]";
	}

	
	

	
	
	
	
	

}
