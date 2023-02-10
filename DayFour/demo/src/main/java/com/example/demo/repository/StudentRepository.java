package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("SELECT S FROM Student S where S.rollNo = ?1")
    Optional<Student> findStudentByRollNumber(int rollNumber);
}
