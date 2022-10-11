package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Tutorial;
import com.cybage.service.TutorialService;

@RequestMapping(value = "/tutorial",method = RequestMethod.POST)
@RestController
public class TutorialController {

	@Autowired
	TutorialService tutoservice;

	@PostMapping("/addTut")
	public ResponseEntity<String> addTutorial(@RequestBody Tutorial tutorial) throws Exception  {

		tutoservice.addTutorial(tutorial);
		return new ResponseEntity<String>("record added successfully", HttpStatus.CREATED);

	}

	@GetMapping("/")
	public ResponseEntity<List<Tutorial>> getAllTutorial()

	{

		return new ResponseEntity<List<Tutorial>>(tutoservice.showAll(), HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Tutorial> getTutorial(@PathVariable int id) {
		Tutorial tutorial = tutoservice.getById(id);

		return new ResponseEntity<Tutorial>(tutorial, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTutorial(@PathVariable int id) {
		tutoservice.deleteTutorial(id);
		return new ResponseEntity<String>("record deleted", HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateTutorial(@PathVariable int id, Tutorial tutorial) {
		tutoservice.updateTutorial(id, tutorial);
		return new ResponseEntity<String>("record updated", HttpStatus.OK);
	}

}
