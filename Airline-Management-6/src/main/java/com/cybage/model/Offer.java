package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "offers")
public class Offer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int offerId;

	private String offerName;
	private int offerRate;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "flightId")
	private Flight flight;

	public Offer() {
		super();
	}

	public Offer(int offerId, String offerName, int offerRate, Flight flight) {
		super();
		this.offerId = offerId;
		this.offerName = offerName;
		this.offerRate = offerRate;
		this.flight = flight;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public int getOfferRate() {
		return offerRate;
	}

	public void setOfferRate(int offerRate) {
		this.offerRate = offerRate;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Offer [offerId=" + offerId + ", offerName=" + offerName + ", offerRate=" + offerRate + ", flight="
				+ flight + "]";
	}

}
