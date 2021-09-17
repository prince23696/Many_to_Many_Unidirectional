package com.Many_to_Many.Many_to_Many_Uni.Service;

import com.Many_to_Many.Many_to_Many_Uni.Entity.Student;
import com.Many_to_Many.Many_to_Many_Uni.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student getStudent(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student Added Successfully";
    }

    @Override
    public Student updateStudent(int id, Student student) {
        Student student1 = studentRepository.findById(id).get();
        student1.setName(student.getName());
        System.out.println(student1.getName());
        student1.setPlace(student.getPlace());
        System.out.println(student1.getPlace());
        student1.setCourse(student.getCourse());
        System.out.println(student1.getCourse());
        studentRepository.save(student1);
        return student1;
    }

    @Override
    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "Student Deleted Successfully";
    }
}
