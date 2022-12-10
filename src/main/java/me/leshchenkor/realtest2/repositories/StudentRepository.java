package me.leshchenkor.realtest2.repositories;

import me.leshchenkor.realtest2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
