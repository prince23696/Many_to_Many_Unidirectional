package com.Many_to_Many.Many_to_Many_Uni.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int c_id;
    private String c_name;
    private int fee;

    public Course() {
    }

    public Course(int c_id) {
        this.c_id = c_id;
    }

    public Course(int c_id, String c_name, int fee) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.fee = fee;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Course{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", fee=" + fee +
                '}';
    }
}
