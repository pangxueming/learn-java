package com.test.mapper;

import com.test.entity.Teacher;
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
public interface TeacherMapper {
  @Select("select * from teacher")
  List<Teacher> findAllTeacher();
}
