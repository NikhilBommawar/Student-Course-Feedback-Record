package com.example.Pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stid;
	private String name;
	@OneToMany(mappedBy = "student")
	@JsonManagedReference
	private List<CourseFeedback> feedback=new ArrayList<>();
	
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<CourseFeedback> getFeedback() {
		return feedback;
	}
	public void setFeedback(CourseFeedback feedback) {
		this.feedback.add(feedback);
	}
	
	
}
