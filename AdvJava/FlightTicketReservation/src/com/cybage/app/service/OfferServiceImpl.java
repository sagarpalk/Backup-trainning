package com.cybage.app.service;

import java.sql.SQLException;

import java.util.List;

import com.cybage.app.dao.OfferDaoImpl;
import com.cybage.app.model.Offer;

public class OfferServiceImpl implements OfferService {

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
