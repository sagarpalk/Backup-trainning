package com.cybage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {

}
