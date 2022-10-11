package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Offer;
import com.cybage.repositories.OfferRepository;

@Service
public class OfferService {
	@Autowired
	private OfferRepository offerRepository;

	public void addOffer(Offer offer) {
		System.out.println(offer);
		offerRepository.save(offer);
	}

	public List<Offer> getAllOffers() {
		return offerRepository.findAll();
	}

	public Offer getById(int id) {
		offerRepository.findById(id);
		return offerRepository.getById(id);
	}

	public void removeOffer(Offer offer) {
		offerRepository.delete(offer);
		System.out.println("Record deleted from Database");
	}
}
