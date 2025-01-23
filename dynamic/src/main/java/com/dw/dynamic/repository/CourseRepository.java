package com.dw.dynamic.repository;

import com.dw.dynamic.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,String> {
    List<Course> findByTitleLike(String title);
}
