package com.cbc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbc.model.Course;
import com.cbc.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;


	public Course upsert(Course course) {
		
		courseRepository.save(course);  //insert and update
		
		return course;
		//return "success";
	}

	
	public Course getById(int cid) {
		
		Optional<Course> findCourse	=courseRepository.findById(cid);
		
		if(findCourse.isPresent()) {
			return findCourse.get();
		}
		
		return null;
	
	}

	
	public List<Course> getAllCourse() {
		
		return courseRepository.findAll();
	}


	public String deleteById(int id) {
		
		if(courseRepository.existsById(id)) {
			courseRepository.deleteById(id);
			return "delete success";
		}
		return "no record found";
	}

}
