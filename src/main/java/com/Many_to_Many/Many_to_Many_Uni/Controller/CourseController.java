package com.Many_to_Many.Many_to_Many_Uni.Controller;

import com.Many_to_Many.Many_to_Many_Uni.Entity.Course;
import com.Many_to_Many.Many_to_Many_Uni.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("getCourse/{id}")
    public Course getCourse(@PathVariable int id) {
        Course course = courseService.getCourse(id);
        return course;
    }

    @GetMapping("/getCourses")
    public List<Course> getAllCourse() {
        return (List<Course>) courseService.getAllCourses();
    }

    @PostMapping("/saveCourse")
    public Course addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
        return course;
    }

    @DeleteMapping("/deleteCourse/{id}")
    public String deleteCourse(@PathVariable int id) {
        courseService.deleteCourse(id);
        return "item deleted form database id=" + id;
    }

    @PutMapping("/updateCourse/{id}")
    public Course updateCourse(@PathVariable int id, @RequestBody Course course) {
        courseService.updateCourse(id, course);
        return course;
    }
}
