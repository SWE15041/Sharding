package org.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.example.domain.Course;
import org.example.mapper.CourseMapper;
import org.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Course> listAll() {
        QueryWrapper queryWrapper = new QueryWrapper();
        return courseMapper.selectList(queryWrapper);
    }
}
