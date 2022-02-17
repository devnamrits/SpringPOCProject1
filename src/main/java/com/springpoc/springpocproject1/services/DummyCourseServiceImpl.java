package com.springpoc.springpocproject1.services;

import com.springpoc.springpocproject1.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
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
        for(Course course:list){
            if(course.getId()==courseId){
                return course;
            }
        }
        return null;
    }
}
