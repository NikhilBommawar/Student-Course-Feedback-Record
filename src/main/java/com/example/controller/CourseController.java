package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Pojo.CourseFeedback;
import com.example.Pojo.Courses;
import com.example.dto.CourseDAO;

@RestController
public class CourseController {
	@Autowired
	CourseDAO cdao;

	@PostMapping("saveCourse")
	public Courses saveCourse(@RequestBody Courses course) {
		return cdao.saveCourse(course);
		
	}
	
	@PostMapping("assigncourse/{fid}/{cid}")
	public CourseFeedback cfeed(@PathVariable Integer fid,@PathVariable Integer cid ) {
		return cdao.assigncourse(fid,cid);
	}

}