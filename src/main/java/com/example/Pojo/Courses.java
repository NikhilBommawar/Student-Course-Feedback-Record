package com.example.Pojo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Courses {
     
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseid;
	private String coursename;
	@OneToMany(mappedBy = "course")
	@JsonManagedReference
	@JsonIgnore
    private Set<CourseFeedback> feedback=new HashSet<>(); ;
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public Set<CourseFeedback> getFeedback() {
		return feedback;
	}
	public void setFeedback(CourseFeedback feedback) {
		this.feedback.add(feedback);
	}
	
	
}

