package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Offer;
import com.cybage.service.OfferService;

@RestController
@RequestMapping("/offers")
public class OfferController {
	@Autowired
	private OfferService offerService;

	@PostMapping("/")
	public ResponseEntity<String> addoffer(@RequestBody Offer offer) {
		offerService.addOffer(offer);
		return new ResponseEntity<String>("Record added successfully", HttpStatus.CREATED);
	}

	@GetMapping("/getAllOffers")
	public ResponseEntity<List<Offer>> getAllOffers() {
		return new ResponseEntity<List<Offer>>(offerService.getAllOffers(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteoffer(@PathVariable int id) {
		Offer index = offerService.getById(id);
		offerService.removeOffer(index);
		return new ResponseEntity<String>("Record deleted successfully", HttpStatus.CREATED);
	}
}
