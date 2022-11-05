package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Pojo.CourseFeedback;
import com.example.Pojo.Courses;

public interface FeedRepo extends JpaRepository<CourseFeedback, Integer> {

	@Query("select feedback from CourseFeedback feedback where course=?1")
	 public List<CourseFeedback> getcoursefeedback(Courses course);

}