package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Offer;
import com.cybage.model.User;
import com.cybage.service.OfferService;

@RestController
@RequestMapping("/offers")
@CrossOrigin("*")
public class OfferController {

	@Autowired
	private OfferService offerService;
	
	@PostMapping("/")
	public ResponseEntity<String>addOffer(@RequestBody Offer offer)
	{
		offerService.addOffer(offer);
		return new ResponseEntity<String>("OFFER ADDED SUCCESSFULLY",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getAllOffer")
	public ResponseEntity<List<Offer>> getAllOffer()
	{
		return new ResponseEntity<List<Offer>>(offerService.getAllOffer(),HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id)
	{
		Offer index=offerService.getById(id);
		
		offerService.removeOffer(index);
		return new ResponseEntity<String>("DELETED SUCCESSFULLY",HttpStatus.CREATED);
	}
	
	
}
