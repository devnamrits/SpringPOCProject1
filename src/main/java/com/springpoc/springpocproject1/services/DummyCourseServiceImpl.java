package com.springpoc.springpocproject1.services;

import com.springpoc.springpocproject1.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DummyCourseServiceImpl implements CourseService {
    @Override
    public List<Course> getCourses() {
        return new ArrayList<>(List.of(new Course(1, "Hindi", "Hindi Language"), new Course(2, "Maths", "Mathematics")));
    }
}
