package com.springpoc.springpocproject1.services;

import java.util.List;

import com.springpoc.springpocproject1.entities.Course;

public interface CourseService {
    List<Course> getCourses();

    Course getCourse(long courseId);

    Course postCourse(Course course);
}
