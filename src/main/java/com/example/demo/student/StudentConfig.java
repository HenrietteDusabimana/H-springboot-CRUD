package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student henriette = new Student(
                    "Henriette",
                    "dhenrietted@gmail.com",
                    LocalDate.of(2000, 4, 9));

            Student honore = new Student(
                    "honore",
                    "dhonre@gmail.com",
                    LocalDate.of(1992, 4, 9));

            repository.saveAll(
                    List.of(henriette, honore)
            );
        };
    }
}
