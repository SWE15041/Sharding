package org.example.service;

import org.example.domain.Course;

import java.util.List;

/**
 * @author Yanni
 */
public interface CourseService {
    void insert(Course course);

    List<Course> listAll();
}
