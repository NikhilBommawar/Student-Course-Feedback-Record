package com.example.dto;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Pojo.CourseFeedback;
import com.example.Pojo.Courses;
import com.example.Pojo.Student;
import com.example.Repository.CourseRepository;
import com.example.Repository.FeedRepo;
import com.example.Repository.StudentRepo;

@Service
public class FeedbackDAO {

	@Autowired
	FeedRepo frepo;
	@Autowired
	StudentRepo srepo;
	@Autowired
	CourseRepository crepo;
	
	Logger log=Logger.getAnonymousLogger();
	public CourseFeedback svfeed(CourseFeedback fd) {
		return frepo.save(fd); 
	}
	
	public List<CourseFeedback> getfeed(){
		return frepo.findAll();
	}

	public CourseFeedback stfeed(int sid,int fid) {
		// TODO Auto-generated method stub
		log.info("student feedback dao");
		Student student=srepo.getById(sid);
		CourseFeedback feedback=frepo.getById(fid);
		feedback.setStudent(student);
		return frepo.save(feedback);
	}

	public List<CourseFeedback> getcoursefeedbacks(int cid) {
		// TODO Auto-generated method stub
		log.info("entered into get feedback dao");
	

		Courses course=crepo.getById(cid);
		log.info("feedbacks -> {}"+frepo.getcoursefeedback(course));
		return frepo.getcoursefeedback(course);
	}

	public List<CourseFeedback> getfeedbacks() {
		// TODO Auto-generated method stub
		 return frepo.findAll();
	}
}
