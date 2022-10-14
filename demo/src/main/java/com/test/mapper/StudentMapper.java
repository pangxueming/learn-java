package com.test.mapper;

import com.test.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author
 * @since 2022-10-14
 */
@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> findAllStudent();
}
