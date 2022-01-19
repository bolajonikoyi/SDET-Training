package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//service layer is mainly responsible for business logic
//@Component
@Service
public class StudentService {
    public List<Student> getStudent() {
        return List.of(
                new Student(1L,
                        "Bolaji",
                        "Bolaji@gmail.com",
                        LocalDate.of(2005, Month.JANUARY, 5),
                        26));
    }
}
