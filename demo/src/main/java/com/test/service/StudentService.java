package com.test.service;

import com.test.entity.Student;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author
 * @since 2022-10-14
 */
public interface StudentService {
  public List<Student> findAll();
}
