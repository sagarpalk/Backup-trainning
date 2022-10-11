package com.cybage.app.service;

import java.sql.SQLException;

import java.util.List;

import com.cybage.app.model.Offer;

public interface OfferService {

	public void addNewOffer(Offer newoffer) throws SQLException;
	
	public int updateOffer(Offer newoffer) throws SQLException;
	
	//public int updateOffer(int o_offerid) throws SQLException;
}
