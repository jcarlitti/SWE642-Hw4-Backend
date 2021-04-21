package com.swe642.service;

import com.swe642.entity.Student;
import com.swe642.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> students) {
        return repository.saveAll(students);
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Student getStudentByName(String name) {
        return repository.findByName(name);
    }

    public String deleteStudent(int id) {
        repository.deleteById(id);
        return "Student removed !! " + id;
    }

    public Student updateStudent(Student student) {
//        Student existingStudent = repository.findByName(student.getId()).orElse(null);
//        existingStudent.setName(student.getName());
//        existingStudent.setLastname(student.getLastname());
//        existingStudent.setAddress(student.getAddress());
//        existingStudent.setCity(student.getCity());
//        existingStudent.setState(student.getState());
//        existingStudent.setZip(student.getZip());
//        existingStudent.setPhone(student.getPhone());
//        existingStudent.setEmail(student.getEmail());
//        existingStudent.setDos(student.getDos());
//        existingStudent.setAbout_college(student.getAbout_college());
//        existingStudent.setInterested(student.getInterested());
//        existingStudent.setRecommend(student.getRecommend());
//        return repository.save(existingStudent);
        return student;
    }


}
