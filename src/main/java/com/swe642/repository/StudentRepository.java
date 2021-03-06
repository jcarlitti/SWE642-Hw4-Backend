package com.swe642.repository;

import com.swe642.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Find a student by name
 */

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByName(String name);
}

