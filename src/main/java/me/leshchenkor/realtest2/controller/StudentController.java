package me.leshchenkor.realtest2.controller;

import me.leshchenkor.realtest2.entity.Student;
import me.leshchenkor.realtest2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping(value = "{id}")
    public Student getById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
}
