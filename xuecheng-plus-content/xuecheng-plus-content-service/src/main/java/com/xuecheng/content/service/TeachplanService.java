package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * @Author chenhaitian
 * @Packge com.xuecheng.content.service
 * @Date 2025/3/2 12:02
 * @description 课程基本信息管理业务接口
 */
public interface TeachplanService {

    /**
     * @param courseId
     * @return com.xuecheng.content.model.po.Teachplan
     * @description 查询课程计划树形结构
     * @author Mr.M
     * @date 2022/9/8 11:29
     */
    public List<TeachplanDto> findTeachplanTree(long courseId);

}


