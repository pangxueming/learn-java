package com.test.controller;

import com.test.entity.Teacher;
import com.test.service.TeacherService;
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
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/test/teacher")
    public List<Teacher> readAll() {
        List<Teacher> list = teacherService.findAll();
        return list;
    }
}
