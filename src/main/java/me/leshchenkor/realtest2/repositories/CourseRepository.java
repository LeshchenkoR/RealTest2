package me.leshchenkor.realtest2.repositories;

import me.leshchenkor.realtest2.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
