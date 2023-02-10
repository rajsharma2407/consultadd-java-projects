package com.example.demo.configuration;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class Configurations {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student raj = new Student(1, "Raj", "Sharma", LocalDate.now(), "12th");
            Student brash = new Student(2, "brash", "Sharma", LocalDate.now(), "12th");
            studentRepository.saveAll(List.of(raj, brash));
        };
    }
}
