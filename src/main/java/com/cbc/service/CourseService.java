package com.cbc.service;

import java.util.List;

import com.cbc.model.Course;

public interface CourseService {

	public Course upsert(Course course); //insert,update
	
	public Course getById(int cid);
	
	public List<Course> getAllCourse();
	
	public String deleteById(int id);
}
