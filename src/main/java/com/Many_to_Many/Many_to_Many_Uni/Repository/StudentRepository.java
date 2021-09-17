package com.Many_to_Many.Many_to_Many_Uni.Repository;

import com.Many_to_Many.Many_to_Many_Uni.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
