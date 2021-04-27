package com.swe642.controller;

import com.swe642.entity.Student;
import com.swe642.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * Rest Controller class 
 */

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    //Add Student
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }
    
    //Add Students
    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return service.saveStudents(students);
    }

    //Return students
    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return service.getStudents();
    }

    //Get student by id
    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    //Return student by name
    @GetMapping("/student/{name}")
    public Student findStudentByName(@PathVariable String name) {
        return service.getStudentByName(name);
    }

    //Update the student
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    //Delete the student by ID
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }
}
