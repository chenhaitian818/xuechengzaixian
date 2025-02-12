package com.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @Author chenhaitian
 * @Packge com.xuecheng.content.model.dto
 * @Date 2025/2/5 11:23
 * @description 课程查询条件模型类
 */
@Data
@ToString
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;

}
