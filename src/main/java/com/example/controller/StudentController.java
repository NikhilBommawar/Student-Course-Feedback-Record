package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Pojo.Student;
import com.example.dto.StudentDAO;

@RestController
public class StudentController {
 
	@Autowired(required=false)
	StudentDAO dao;
	
	@PostMapping("insert")
	public Student insert(@RequestBody Student s) {
		return dao.insertStudent(s);
	}
	
	@GetMapping("getallstudent")
    public List<Student> getall(){
		return dao.getall();
	}
}
