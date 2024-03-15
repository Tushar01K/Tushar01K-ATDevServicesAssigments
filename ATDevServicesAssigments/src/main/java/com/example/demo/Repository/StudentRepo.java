package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
