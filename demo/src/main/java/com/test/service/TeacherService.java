package com.test.service;

import com.test.entity.Teacher;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author
 * @since 2022-10-14
 */
public interface TeacherService {
  public List<Teacher> findAll();
}
