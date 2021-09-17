package com.Many_to_Many.Many_to_Many_Uni.Service;

import com.Many_to_Many.Many_to_Many_Uni.Entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudent();

    public Student getStudent(int id);

    public String addStudent(Student student);

    public Student updateStudent(int id, Student student);

    public String deleteStudent(int id);
}
