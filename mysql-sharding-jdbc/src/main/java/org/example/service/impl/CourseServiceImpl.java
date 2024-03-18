package org.example.service.impl;

import org.example.domain.Course;
import org.example.mapper.CourseMapper;
import org.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yanni
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;

    @Override
    public void insert(Course course) {
        courseMapper.insert(course);
    }
}
