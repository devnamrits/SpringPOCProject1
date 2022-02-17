package com.springpoc.springpocproject1.controller;

import com.springpoc.springpocproject1.entities.Course;
import com.springpoc.springpocproject1.services.CourseService;
import com.springpoc.springpocproject1.services.DummyCourseServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/home")
    public String hello(){
        return "Hello Spring";
    }

    //get the Course

    @GetMapping("/courses")
    public List<Course> getCourses(){
        CourseService courseService = new DummyCourseServiceImpl();
        return courseService.getCourses();
    }
}
