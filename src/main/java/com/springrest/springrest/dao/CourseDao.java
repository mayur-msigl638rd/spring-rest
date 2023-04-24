package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {    // we are using long here because here 
	                                                                //we have to defined the parameter which is primary key      
	                                                                //and our id is of primary key which is of long type     

}
