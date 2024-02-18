package com.Springcourse1.Springcourse1.services;

import java.util.List;

import com.Springcourse1.Springcourse1.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourses(Long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long courseId);
}
