package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @Author chenhaitian
 * @Packge com.xuecheng.content.service
 * @Date 2025/2/22 13:39
 * @description 课程分类树形结构查询
 */
public interface CourseCategoryService {
    public List<CourseCategoryTreeDto> queryTreeNodes(String id);
}
