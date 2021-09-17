package com.Many_to_Many.Many_to_Many_Uni.Service;

import com.Many_to_Many.Many_to_Many_Uni.Entity.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getAllCourses();

    public Course getCourse(int id);

    public String addCourse(Course course);

    public Course updateCourse(int id, Course course);

    public String deleteCourse(int id);
}
