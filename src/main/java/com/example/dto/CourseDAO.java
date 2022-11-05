package com.example.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Pojo.CourseFeedback;
import com.example.Pojo.Courses;
import com.example.Repository.CourseRepository;
import com.example.Repository.FeedRepo;

@Service
public class CourseDAO {

	@Autowired
	CourseRepository crepo;
	@Autowired
	FeedRepo frepo;
	public Courses saveCourse(Courses course) {
		
		return crepo.save(course);
	}
	public CourseFeedback assigncourse(Integer fid, Integer cid) {
		
		CourseFeedback feedback=frepo.getById(fid);
		Courses course=crepo.getById(cid);
		feedback.setCourse(course);
		return frepo.save(feedback);
	}

}
