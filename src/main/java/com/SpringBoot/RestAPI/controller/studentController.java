package com.SpringBoot.RestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.RestAPI.entity.student;
import com.SpringBoot.RestAPI.repository.studentRepository;

@RestController
public class studentController {
    
    @Autowired
    private studentRepository repo;

    @GetMapping("/students")
    public List<student> getStudents() {
        // Fetch the list of students from the repository
        return repo.findAll();
    }
}
