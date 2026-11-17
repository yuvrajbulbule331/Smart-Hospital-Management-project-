package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Students;
import com.service.StudentService;

@RestController

@RequestMapping("/students")
@CrossOrigin(origins="http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Students addStudent(@RequestBody Students student) {

        return service.addStudent(student);
    }

    @GetMapping
    public List<Students> getAllStudents() {

        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Students getStudent(@PathVariable Long id) {

        return service.getStudentById(id);
    }
}