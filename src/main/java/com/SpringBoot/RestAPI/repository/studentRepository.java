package com.SpringBoot.RestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.RestAPI.entity.student;

public interface studentRepository extends JpaRepository<student, Integer>{

}
