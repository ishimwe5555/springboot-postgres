package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student("e", "email@example.com", LocalDate.of(2000, Month.JANUARY, 5), 21);
            Student jane = new Student("Jane", "email@example2.com", LocalDate.of(2004, Month.JANUARY, 5), 21);
            repository.saveAll(List.of(john, jane));
        };
    }
}
