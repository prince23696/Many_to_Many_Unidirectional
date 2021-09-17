package com.Many_to_Many.Many_to_Many_Uni.Service;

import com.Many_to_Many.Many_to_Many_Uni.Entity.Course;
import com.Many_to_Many.Many_to_Many_Uni.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course getCourse(int id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public String addCourse(Course course) {
        courseRepository.save(course);
        return "Course Added Successfully";
    }

    @Override
    public Course updateCourse(int id, Course course) {
        Course course1 = courseRepository.findById(id).get();
        course1.setC_name(course.getC_name());
        course1.setFee(course.getFee());
        courseRepository.save(course1);
        return course1;
    }

    @Override
    public String deleteCourse(int id) {
        courseRepository.deleteById(id);
        return "Course Deleted Successfully";
    }
}
