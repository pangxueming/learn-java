package com.test.service.impl;

import com.test.entity.Teacher;
import com.test.mapper.TeacherMapper;
import com.test.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author
 * @since 2022-10-14
 */
@Service
public class TeacherServiceImpl implements TeacherService {
  @Autowired
  private TeacherMapper teacherMapper;

  @Override
  public List<Teacher> findAll() {
    List<Teacher> list = teacherMapper.findAllTeacher();
    System.out.println(list);
    return list;
  }

}
