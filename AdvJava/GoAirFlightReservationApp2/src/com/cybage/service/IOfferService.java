package com.cybage.service;

import java.sql.SQLException;

import com.cybage.model.Offer;



public interface IOfferService {

	public void addNewOffer(Offer newoffer) throws SQLException;
	
	public int updateOffer(Offer newoffer) throws SQLException;
	
	//public int updateOffer(int o_offerid) throws SQLException;
}
