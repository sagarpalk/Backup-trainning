package com.cybage.service;

import java.sql.SQLException;

import com.cybage.dao.OfferDaoImpl;
import com.cybage.model.Offer;



public class OfferServiceImpl implements IOfferService {

	OfferDaoImpl offerDaoImpl = new OfferDaoImpl();

	@Override
	public void addNewOffer(Offer newOffer) throws SQLException {

		offerDaoImpl.addNewOffer(newOffer);
	}

	@Override
	public int updateOffer(Offer newoffer) throws SQLException {

		offerDaoImpl.updateOffer(newoffer);

		return 0;
	}

}
