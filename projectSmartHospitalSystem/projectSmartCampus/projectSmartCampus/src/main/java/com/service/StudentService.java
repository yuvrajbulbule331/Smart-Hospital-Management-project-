

package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentRepository;
import com.model.Students;



@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Students addStudent(Students student) {

        return studentRepository.save(student);
    }

    public List<Students> getAllStudents() {

        return studentRepository.findAll();
    }

    public Students getStudentById(Long id) {

        return studentRepository.findById(id).orElseThrow();
    }
}