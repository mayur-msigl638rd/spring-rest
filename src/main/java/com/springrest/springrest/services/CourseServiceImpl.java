package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	//ArrayList<Course>list;
	
	public CourseServiceImpl() {
		
		/*
		 * list = new ArrayList<>(); list.add(new Course(145,
		 * "java core course","this course contains basics")); list.add(new Course(3435,
		 * "spring boot course", "this course contain basics"));
		 */
		
	}
	
	@Override
	public ArrayList<Course> getCourses() {
		
		/* return list; */
		return (ArrayList<Course>) courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		/*
		 * Course c = null; for(Course course :list) { if(course.getId()==courseId)
		 * c=course; break; } return c;
		 */
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		/*
		 * // TODO Auto-generated method stub list.add(course); return course;
		 */
		courseDao.save(course); // if this course already available so save will update it
		return course;
	}
	
	
@Override
	public Course updateCourse(Course course) {
		
		/*
		 * list.forEach(e -> { if(e.getId() == course.getId()) {
		 * 
		 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription()); }
		 * 
		 * 
		 * });
		 * 
		 * 
		 * return course;
		 */
	
	courseDao.save(course);
	return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
		
		/*
		 * Course crs=null;
		 * 
		 * for(Course c : list) { if(c.getId() == courseId) { crs = c; list.remove(c);
		 * break; }
		 * 
		 * } return crs;
		 */
		Course entity = courseDao.getOne(parseLong);
	  courseDao.delete(entity);
	}

	

	
	

}
