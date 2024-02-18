package com.Springcourse1.Springcourse1.CourseDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.Springcourse1.Springcourse1.entities.Course;

public interface CoursesDao extends JpaRepository<Course, Long>{

}
