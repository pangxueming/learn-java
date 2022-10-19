package com.test.controller;

import com.test.entity.Student;
import com.test.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author
 * @since 2022-10-14
 */
@RestController
public class StudentController {
  @Autowired
  private StudentService studentService;

  @RequestMapping("/test/student")
  public List<Student> readAll() {
    List<Student> list = studentService.findAll();
    return list;
  }

}

