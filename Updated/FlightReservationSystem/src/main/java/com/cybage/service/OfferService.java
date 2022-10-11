package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Flight;
import com.cybage.model.Offer;
import com.cybage.model.User;
import com.cybage.repositories.OfferRepository;

@Service
public class OfferService {
	
	@Autowired
	private OfferRepository offerRepository;
	
	public Offer addOffer (Offer offer)
	{
		return offerRepository.save(offer);
	}

	public List<Offer> getAllOffer() {
		// TODO Auto-generated method stub
		return offerRepository.findAll();
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
		System.out.println("offer deleted");
	}

	public Offer getById(int id) {
		// TODO Auto-generated method stub
		return offerRepository.getById(id);
	}

	public void removeOffer(Offer offer) {
		// TODO Auto-generated method stub
		offerRepository.delete(offer);
		System.out.println("Offer DELETED SUCCESSFULLY FROM DATABASE");
		
	}
	
	
}
