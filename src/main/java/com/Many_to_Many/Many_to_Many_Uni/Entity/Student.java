package com.Many_to_Many.Many_to_Many_Uni.Entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int s_id;
    private String name;
    private String place;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Course> course;

    public Student() {
    }

    public Student(int s_id) {
        this.s_id = s_id;
    }

    public Student(int s_id, String name, String place, Set<Course> course) {
        this.s_id = s_id;
        this.name = name;
        this.place = place;
        this.course = course;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Set<Course> getCourse() {
        return course;
    }

    public void setCourse(Set<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", course=" + course +
                '}';
    }
}
