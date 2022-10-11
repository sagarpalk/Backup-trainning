package com.cybage.app.dao;

import java.sql.SQLException;

import java.util.List;

import com.cybage.app.model.Offer;

public interface OfferDao {

	public void addNewOffer(Offer newOffer) throws SQLException;

	public int deleteOffer(int o_offerid) throws SQLException;
	
	public int updateOffer(Offer newoffer) throws SQLException;
	
	public int updateOffer(int o_offerid) throws SQLException;
	
	List<Offer> selectAllOffers() throws SQLException;

}
