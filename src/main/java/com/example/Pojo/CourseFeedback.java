package com.example.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@JsonAutoDetect
public class CourseFeedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedid;
	private String feedback;
	@ManyToOne
	@JsonBackReference
		private Student student;
	
	@ManyToOne
	@JsonIgnore
	@JsonBackReference
	private Courses course;

	public int getFeedid() {
		return feedid;
	}
	public void setFeedid(int feedid) {
		this.feedid = feedid;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student= student;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	
    
}
