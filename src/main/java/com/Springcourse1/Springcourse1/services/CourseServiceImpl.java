package com.Springcourse1.Springcourse1.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springcourse1.Springcourse1.CourseDao.CoursesDao;
import com.Springcourse1.Springcourse1.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CoursesDao coursesDao;
//	List<Course> list;
	
	public CourseServiceImpl() {
//		list= new ArrayList<>();
//		list.add(new Course(190,"JAVA","Course of java"));
//		list.add(new Course(190,"C++","Course of C++"));
//		list.add(new Course(190,"Python","Course of Python"));
	}
	@Override
	public List<Course> getCourses() {
		
		return coursesDao.findAll();
		
	}
	@Override
	public Course getCourses(Long courseId) {
		
//		Course c = null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		return coursesDao.getById(courseId);
	}
	
	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		coursesDao.save(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e ->{
//			
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		coursesDao.save(course);
		return course;
	}
	
	@Override
	public void deleteCourse(long courseId) {
//		list=this.list.stream().filter(e ->e.getId()!=courseId).collect(Collectors.toList());
		
		Course entity = coursesDao.getOne(courseId);
		System.out.println(entity);
		coursesDao.delete(entity);
		
	}
	


}
