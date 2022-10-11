package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tutorial_details")
public class Tutorial {
	
	@Id
	@Column(name="tutorial_id")
	private  int tutorialId;
	
	@Column(name="tutorial_Name")
	private String tutorialName;
	

	private String description;
	public Tutorial(int tutorialId, String tutorialName, String description) {
		super();
		this.tutorialId = tutorialId;
		this.tutorialName = tutorialName;
		this.description = description;
	}
	public Tutorial() {
		super();
	}
	public int getTutorialId() {
		return tutorialId;
	}
	public void setTutorialId(int tutorialId) {
		this.tutorialId = tutorialId;
	}
	public String getTutorialName() {
		return tutorialName;
	}
	public void setTutorialName(String tutorialName) {
		this.tutorialName = tutorialName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Tutorial [tutorialId=" + tutorialId + ", tutorialName=" + tutorialName + ", description=" + description
				+ "]";
	}
	
	

}
