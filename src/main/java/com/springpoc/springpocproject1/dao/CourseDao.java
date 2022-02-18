package com.springpoc.springpocproject1.dao;

import com.springpoc.springpocproject1.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

// Course is the entity
// Long is the primary Key
public interface CourseDao extends JpaRepository<Course, Long> {

}
