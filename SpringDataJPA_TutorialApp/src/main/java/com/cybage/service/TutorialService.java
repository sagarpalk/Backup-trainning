package com.cybage.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.cybage.dao.TutorialRepository;
import com.cybage.model.Tutorial;

@Service
public class TutorialService   {

	@Autowired
	private TutorialRepository dao;
	
	public void addTutorial(Tutorial tutorial) {
		
		System.out.println(tutorial);
		dao.save(tutorial);
	}

	public List<Tutorial> showAll() {
		 return dao.findAll();
		
	}

	public Tutorial getById(int id) {
		return dao.getById(id);
	}

	public void deleteTutorial(int id) {
		 dao.deleteById(id);
		
	}

	public void updateTutorial(int id, Tutorial tutorial) {
		dao.getById(id);
		
		
	}

	
	
	
		

	

}
