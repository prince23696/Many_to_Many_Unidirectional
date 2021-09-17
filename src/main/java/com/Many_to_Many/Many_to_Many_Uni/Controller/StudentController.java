package com.Many_to_Many.Many_to_Many_Uni.Controller;

import com.Many_to_Many.Many_to_Many_Uni.Entity.Student;
import com.Many_to_Many.Many_to_Many_Uni.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("getStudent/{id}")
    public Student getStudent(@PathVariable int id) {
        Student student = studentService.getStudent(id);
        return student;
    }

    @GetMapping("/getStudents")
    public List<Student> getAllStudent() {
        return (List<Student>) studentService.getAllStudent();
    }

    @PostMapping("/saveStudent")
    public Student addStudent(@RequestBody Student Student) {
        studentService.addStudent(Student);
        return Student;
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "item deleted form database id=" + id;
    }

    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student Student) {
        studentService.updateStudent(id, Student);
        return Student;
    }
}
