package org.example.service;

import org.example.SpringTest;
import org.example.domain.Course;
import org.example.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Yanni
 */
class CourseServiceTest extends SpringTest {
    @Autowired
    private CourseService courseService;

    @Test
    void insert() {
        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            // 注意: cid使用雪花算法配置了(还可以使用MybatisPlus UUID)，此处不用配置
            course.setCid((long) i);
            course.setUserId(1000L + i);
            course.setCorderNo(1000L + 2 * i);
            course.setCname("ShardingSphere");
            course.setBrief("ShardingSphere保姆级学习教程！！！");
            course.setPrice(99.0);
            course.setStatus(1);
            courseService.insert(course);
        }

    }

    @Test
    void listAll(){
        courseService.listAll();
    }
}