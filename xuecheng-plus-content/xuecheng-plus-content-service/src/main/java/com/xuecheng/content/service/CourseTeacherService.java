package com.xuecheng.content.service;

import com.xuecheng.content.model.po.CourseTeacher;

import java.util.List;

/**
 * @Author chenhaitian
 * @Packge com.xuecheng.content.service
 * @Date 2025/3/4 15:23
 * @description 师资管理接口
 */
public interface CourseTeacherService {
    List<CourseTeacher> getCourseTeacherList(Long courseId);

    CourseTeacher saveCourseTeacher(CourseTeacher courseTeacher);

    void deleteCourseTeacher(Long courseId, Long teacherId);
}
