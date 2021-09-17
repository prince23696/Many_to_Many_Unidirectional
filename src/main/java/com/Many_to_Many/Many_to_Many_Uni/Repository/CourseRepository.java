package com.Many_to_Many.Many_to_Many_Uni.Repository;

import com.Many_to_Many.Many_to_Many_Uni.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
