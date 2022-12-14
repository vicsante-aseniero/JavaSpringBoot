package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents()
    {
        return List.of(
                new Student(
                        1L,
                        "Sante",
                        "sante@my.org",
                        LocalDate.of(2020, Month.NOVEMBER, 18),
                        50
                )
        );
    }
}
