package com.meng.student.controller;

import com.meng.student.dal.entities.Student;
import com.meng.student.dal.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student")
    Iterable<Student> all(){
        return studentRepository.findAll();
    }

    @PostMapping("/student")
    Student newStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping("/student/{id}")
    Optional<Student> one(@PathVariable Long id){
        Optional<Student> byId = studentRepository.findById(id);
        if(byId.isPresent()) return byId;
        return null;
    }

    @DeleteMapping("/student/{id}")
    void deleteStudent(@PathVariable Long id){
        studentRepository.deleteById(id);
    }
}
