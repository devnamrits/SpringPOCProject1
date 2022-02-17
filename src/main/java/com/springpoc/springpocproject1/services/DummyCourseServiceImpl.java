package com.springpoc.springpocproject1.services;

import com.springpoc.springpocproject1.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class DummyCourseServiceImpl implements CourseService {
    @Override
    public List<Course> getCourses() {
        return new ArrayList<>(List.of(new Course(1, "Hindi", "Hindi Language"), new Course(2, "Maths", "Mathematics")));
    }
}
