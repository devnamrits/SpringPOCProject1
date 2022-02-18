package com.springpoc.springpocproject1.services;

import com.springpoc.springpocproject1.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class DummyCourseServiceImpl implements CourseService {
    private List<Course> list;

    public DummyCourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(1, "Hindi", "Hindi Language"));
        list.add(new Course(2, "Math", "Mathematics Language"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        for (Course course : list) {
            if (course.getId() == courseId) {
                return course;
            }
        }
        return null;
    }

    @Override
    public Course postCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course putCourse(Course course) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == course.getId()) {
                list.set(i, course);
            }
        }
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
        list.stream().filter(e -> e.getId() != courseId).collect(Collectors.toList());
    }
}
