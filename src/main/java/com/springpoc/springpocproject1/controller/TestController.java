package com.springpoc.springpocproject1.controller;

import com.springpoc.springpocproject1.entities.Course;
import com.springpoc.springpocproject1.services.CourseService;
import com.springpoc.springpocproject1.services.DummyCourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String hello(){
        return "Hello Spring";
    }

    //get the Courses

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

    //get singe course
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
}
