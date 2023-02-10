package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public void addNewStudent(Student student){
        Optional<Student> findStudent = studentRepository.findStudentByRollNumber(student.getRollNo());
        if(findStudent.isPresent()){
            System.out.println("Student present");
        }else{
            studentRepository.save(student);
            System.out.println("Details saved");
        }
    }

    public void deleteStudentByRollNo(int rollNo) {
        try {
            Student student = studentRepository.getById(rollNo);
            studentRepository.deleteById(rollNo);
        }catch (EmptyResultDataAccessException err){
            System.out.println("Student with roll no " + rollNo + " does not exist");
        }
    }
    @Transactional
    public void updateStudentWithRollNo(Student student){
        Student oldStudent = studentRepository.findById(student.getRollNo()).orElseThrow(()-> new IllegalStateException("Student with rollNo " + student.getRollNo() + " does not exist"));
        String firstName = student.getFirstName();
        String lastName = student.getLastName();

        if(firstName != null && firstName.length() > 0){
            oldStudent.setFirstName(firstName);
        }
        if(lastName != null && lastName.length() > 0){
            oldStudent.setLastName(lastName);
        }
    }
}
