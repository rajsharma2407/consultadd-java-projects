package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class ControllerClass {
    private final StudentService studentService;
    @Autowired
    public ControllerClass(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    private List<Student> studentDetails(){
        return studentService.getStudents();
    }

    @PostMapping
    private void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentRollNo}")
    private void deleteStudent(
            @PathVariable("studentRollNo") int rollNo
    ){
        studentService.deleteStudentByRollNo(rollNo);
    }

    @PutMapping
    private void updateStudent(@RequestBody Student student){
        System.out.println("Reached here");
        studentService.updateStudentWithRollNo(student);
    }
}
