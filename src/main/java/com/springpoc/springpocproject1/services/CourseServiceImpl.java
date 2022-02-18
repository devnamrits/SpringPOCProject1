package com.springpoc.springpocproject1.services;

import com.springpoc.springpocproject1.dao.CourseDao;
import com.springpoc.springpocproject1.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        return courseDao.getById(courseId);
    }

    @Override
    public Course postCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course putCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
        Course course = courseDao.getById(courseId);
        courseDao.delete(course);
    }
}
