package com.example.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Pojo.Student;
import com.example.Repository.StudentRepo;

@Service
public class StudentDAO {
   
	@Autowired
	StudentRepo srepo;
	public Student insertStudent(Student s) {
		return srepo.save(s); 
	}
	
	public List<Student> getall(){
		return srepo.findAll();
	}
}
