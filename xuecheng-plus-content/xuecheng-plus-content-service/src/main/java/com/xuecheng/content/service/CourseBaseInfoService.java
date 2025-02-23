package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @Author chenhaitian
 * @Packge com.xuecheng.content.service
 * @Date 2025/2/18 14:58
 * @description 课程基本信息管理接口
 */
public interface CourseBaseInfoService {


    /**
     * 课程分页查询
     *
     * @param pageParams           分页查询参数
     * @param queryCourseParamsDto 查询条件
     * @return
     */
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);


     /**
     * 新增课程
     * @param companyId 机构id
     * @param addCourseDto 新增课程信息
     * @return 课程添加成功详细信息
     */
    public CourseBaseInfoDto createCourseBase(Long companyId,AddCourseDto addCourseDto);
}
