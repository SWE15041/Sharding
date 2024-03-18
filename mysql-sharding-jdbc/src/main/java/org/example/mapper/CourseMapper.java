package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.domain.Course;

/**
 * @author Yanni
 */
@Mapper
public interface CourseMapper extends BaseMapper<Course> {

}
////public interface CourseMapper {
//    void  insert(Course course);
//}
