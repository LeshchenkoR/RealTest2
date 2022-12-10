package me.leshchenkor.realtest2.service;

import lombok.RequiredArgsConstructor;
import me.leshchenkor.realtest2.entity.Student;
import me.leshchenkor.realtest2.exceptions.StudentNotFoundException;
import me.leshchenkor.realtest2.repositories.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

   private final StudentRepository studentRepository;

    public ResponseEntity<Object> createStudent(Student novice) {
        Student student = studentRepository.save(novice);
        return ResponseEntity.ok().body(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException
                        (String.format("Student with ID %s not exist", id)));
    }
}
