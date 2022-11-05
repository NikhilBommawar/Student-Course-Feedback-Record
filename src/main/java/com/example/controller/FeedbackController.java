package com.example.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.Pojo.CourseFeedback;
import com.example.dto.FeedbackDAO;

@RestController
public class FeedbackController {

	@Autowired
	FeedbackDAO fdao;
	Logger log=Logger.getAnonymousLogger();
	
	@PostMapping("savefeedback")
	public CourseFeedback feed(@RequestBody CourseFeedback fd) {
		return fdao.svfeed(fd);
	}
	
	@GetMapping("getfeed")
	public List<CourseFeedback> get() {
		return fdao.getfeed();
	}
	
	@PostMapping("studenttofeed/{sid}/{fid}")
	public CourseFeedback feed(@PathVariable Integer sid,@PathVariable Integer fid) {
		log.info("student feedback control");
		return fdao.stfeed(sid,fid);
	}

	@GetMapping("coursefeedback/{cid}")
	public List<CourseFeedback> getfeed(@PathVariable Integer cid){
		log.info("entered into get feedback control");
			return fdao.getcoursefeedbacks(cid);
	}
	
	@GetMapping("getfeedbacks")
	public List<CourseFeedback> getfeeds(){
		return fdao.getfeedbacks();
	}
	
}
